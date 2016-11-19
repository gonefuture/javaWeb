package cn.zhku.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.zhku.user.dao.JdbcUtils;
import cn.zhku.user.domain.User;

public class JdbcUserDaoImpl implements UserDao{


	public void addUser(User form) {
		//System.out.println("实现类");
		Connection con =null;
		PreparedStatement pstmt= null;
		try {
			con = JdbcUtils.getConnection();
			//准备sql模板，得到pstmt
			String sql = "INSERT t_user VALUES(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			//为pstmt中的问号赋值
			pstmt.setString(1, form.getUsername());
			pstmt.setString(2,form.getPassword());
			pstmt.setInt(3, form.getAge());
			pstmt.setString(4, form.getGender());
			//执行
			pstmt.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
		try{
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		}catch(SQLException e){}
		}
	}

	public User findByUsername(String username) {
		Connection con =null;
		PreparedStatement pstmt= null;
		ResultSet rs =null;
		try {
			con = JdbcUtils.getConnection();
			//
			String sql = "SELECT * FROM t_user WHERE username=?";
			pstmt = con.prepareStatement(sql);
			//为pstmt中的问号赋值
			pstmt.setString(1, username);
		
			//执行
			rs = pstmt.executeQuery();
			//把rs转换成User类型，返回
			if(rs == null){
				return null;
			}
			if(rs.next()){
				//转换成User对象，并返回
				//ORM -->对象关系映射！ｈｉｂｅｒｎａｔｅ！
				User user = new User();
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setAge(rs.getInt("age"));
				user.setGender(rs.getString("gender"));
				return user;
			}	else{
				return null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}finally{
			try{
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		}catch(SQLException e){}
		}
	}
}
