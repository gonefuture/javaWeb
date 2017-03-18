package cn.zhku.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
					
			/*
			 * 数据库创建连接类
			 * 该工具类不需要被继承
			 */
public class JdbcUtils {
	private static String url = "jdbc:mysql://localhost:3306/user";
	private static String username = "root";
	private static String password ="123";
	
	public JdbcUtils(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch(Exception e){
			throw new RuntimeException(e);
		}
	}
		
	public static  Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,username,password);
	}	

	public static void free(ResultSet rs, Statement st, Connection conn) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (st != null)
					st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
