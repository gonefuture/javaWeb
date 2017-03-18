package cn.zhku.Lianjiechi;



import java.sql.Connection;
import java.sql.SQLException;




import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * 
 * 
 * 
 * 
 */
public class JdbcUtils {
	//配置文件默认配置！要求你必须给出c3p0-confing.xml
	private static DataSource dataSource = new ComboPooledDataSource();
	
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	
	/*
	 * 使用连接池对象
	 * @return
	 * @thows SQLException
	 */
	
	public static Connection getConnection() throws SQLException {
		//当con != null, 说明已经调用过beginTransaction()，表示开启了事务。
		Connection con = tl.get();
		if(con != null) return con;
		return dataSource.getConnection();
	
	}
	
	
	public static DataSource getDataSource(){
		return dataSource;
	}
	
	/*开始事务
	 * 1.获取一个Connection ,设置它的setAutoCommit
	 * 2.还要保证dao中是使用的连接啊hi我们刚刚创建的！
	 */
	
	public static void beginTransaction() throws SQLException{
		/*
		 * 1.给con赋值
		 * 2.给con设置为手动提交
		 */
		Connection con = tl.get();
		if(con != null) throw new SQLException("还没开启事务，就不要重复开启了");
		con =getConnection();
		con.setAutoCommit(false);
		tl.set(con);
	}
	
	/*
	 * 提交事物
	 * 1.获取beginTransation提供的Connection,然后调用commit方法
	 */
	public static void commitTransation() throws SQLException{
		
		Connection con = tl.get();
		if(con == null) throw new SQLException("还没开启事务，不能提交！");
		
		con.commit();
		con.close();
		//把它设置为null,表示事物已经结束了！下次再去调用getConnection()返回的就不是这个Con
		tl.remove();//从tl中移除con
	}
	
	
	
	
	public static void rollbackTransaction() throws SQLException{
		Connection con = tl.get();
		if(con == null) throw new SQLException("还没开启事务，不能回滚！");
		con.rollback();
		con.close();
		tl.remove();
	}
	/*
	 * 释放连接
	 */
	public static void releaseConnection(Connection connection) throws SQLException{
		Connection con = tl.get();
		if(con == null) connection.close();
		
		if(con != connection) connection.close();
		tl.remove();	
	}
	
}	
