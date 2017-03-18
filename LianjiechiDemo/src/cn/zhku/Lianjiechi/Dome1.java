package cn.zhku.Lianjiechi;


import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class Dome1 {

	@Test
	public void fun2() throws SQLException{
		ComboPooledDataSource dataSource =  new ComboPooledDataSource();
		Connection con = dataSource.getConnection();
		System.out.println(con);
		con.close();
		
	}


}
