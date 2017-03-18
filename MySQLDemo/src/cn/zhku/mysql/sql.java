package cn.zhku.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sql {
	Connection con = null;
	ResultSet rs;
	Statement stmt;
	public void fun()  throws Exception{
		
		try{
		String driverClassNane = "com.mysql.jdbc.Driver";
		String url ="jbdc:mysql://loacalhost：3306/";
		String username = "root";
		String password ="123";
		
		Class.forName(driverClassNane);
		con = DriverManager.getConnection(url, username, password);
		 stmt = con.createStatement();
		 String sql ="select *form emp";
		  rs = stmt.executeQuery(sql);
	
		 while(rs.next()){
			 System.out.println(rs.getObject(1)+","
		 +rs.getString("ename")+","+rs.getDouble("sal"));
		 }
		
		} catch(Exception e){
			throw new RuntimeException(e);
		
		}finally{
			if(rs !=null) rs.close();
			if(stmt != null) stmt.close();
			if(con != null) con.close();
			
			
		}
		
		
		}

}
