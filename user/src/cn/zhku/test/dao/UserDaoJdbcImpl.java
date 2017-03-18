package cn.zhku.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.zhku.test.domain.User;

public class UserDaoJdbcImpl implements UserDao {

	@Override
	public User findByUsername(String username) { 
		Connection conn = null;  
		PreparedStatement ps = null;  
		ResultSet rs = null;  
		try{
			conn = JdbcUtils.getConnection(); 
			String sql ="select * from tb_user where username=?";
			ps.setString(1, username);  
			return null;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User form) {
		Connection conn = null;  
		PreparedStatement ps = null;  
		ResultSet rs = null;  
		try {  
		conn = JdbcUtils.getConnection();  
		String sql = "insert into user(uid,username,password,email,phone) values(?,?,?)";  
		ps = conn.prepareStatement(sql);  
		ps.setString(1, form.getUid());  
		ps.setString(2,form.getUsername());
		ps.setString(3, form.getPassword()); 
		ps.setString(4, form.getEmail());  
		ps.setInt(5, form.getPhone());  
		ps.executeUpdate();  
		}catch(SQLException e){  
		//  为了不让业务逻辑层处理该异常，  
		throw new DaoException(e.getMessage(),e) ;  
		} finally {  
		JdbcUtils.free(rs, ps, conn);  
		}  
	}

	@Override
	public User findByPhone(int phone) {
		// TODO Auto-generated method stub
		return null;
	}

}
