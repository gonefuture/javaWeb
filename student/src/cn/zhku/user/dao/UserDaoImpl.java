package cn.zhku.user.dao;



import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import cn.itcast.commons.CommonUtils;
import cn.itcast.jdbc.TxQueryRunner;
import cn.zhku.user.entity.UserEntity;

public class UserDaoImpl implements UserDao{
	private QueryRunner qr = new TxQueryRunner();
	
	@Override
	public UserEntity findByUserName(String userName)  {
		try{
			String sql ="select * from user where userName=?";	
			return qr.query(sql, new BeanHandler<UserEntity>(UserEntity.class), userName);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	@Override
	public UserEntity findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(UserEntity user) {
		try {
			String sql = "insert into user (userName,userPass,age,sex,email) values(?,?,?,?,?)";
			Object[] params = {user.getUserName(),user.getUserPass(),
					user.getAge(),user.getSex(),user.getEmail()};
			qr.update(sql,params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	
	/**@Test
	public void f() {
		UserEntity userEntity = null;
		userEntity = findByUserName("kkk");
		System.out.println(userEntity);
	}**/

	@Test
	public void add() {
		UserEntity user = new UserEntity("4","1",1,"1","1");
		addUser(user);
	}

	
	
}
