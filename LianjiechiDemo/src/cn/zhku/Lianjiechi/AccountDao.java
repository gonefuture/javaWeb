package cn.zhku.Lianjiechi;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

public class AccountDao {
	public static void updata(String name, double money) throws SQLException{
		QueryRunner qr  = new QueryRunner();
		String sql = "updata account set balance=balance+? where name=? ";
		Object [] params = {money,name};
		 Connection con = JdbcUtils.getConnection();  
		qr.update(con,sql,params);
	}

}
