package com.zhku.user.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.zhku.domain.RepairOrder;
import com.zhku.user.domain.User;
import com.zhku.user.domain.WaterOrder;

import cn.itcast.jdbc.TxQueryRunner;


public class UserDao {
	private QueryRunner qr = new TxQueryRunner();
	
	public User findByUserName(String userName){
		try{
			String sql ="select * from user where userName=?";
			System.out .print("哈哈");
			return qr.query(sql, new BeanHandler<User>(User.class), userName);
			
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	public User findByUserPhone(String userPhone){
		
		try {
			String  sql="select * from user where userPhone=?";
			return qr.query(sql, new BeanHandler<User>(User.class),userPhone);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void add(User user){	
		try {
			String sql ="insert into user value(0,?,?,?,?,?)";
			Object [] params ={user.getUserPhone(),user.getUserName(),user.getPassword(),
					user.getShoolpart(),user.getDormitory()};
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}		
	}
	
	public void bookWater(WaterOrder waterOrder){
		try {
			String sql ="insert into user value(?,?,?,?,?,?,?)";
			Object [] params ={waterOrder.getId(),waterOrder.getUser_id(),
					waterOrder.getAdmin_id(),waterOrder.getOrdertime(),
					waterOrder.getDuetime(),waterOrder.getUserduetime(),
					waterOrder.getState()};
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}	
	}
	
	public void repairService(com.zhku.user.domain.RepairOrder form){
		try {
			String sql ="insert into user value(?)";
			Object [] params ={};
			qr.update(sql, params);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}	
	}
	
	public List<WaterOrder> findWaterOrder(int user_id){
		
		try {
			String  sql="select * from waterorder where user_id=?";
			return  qr.query(sql, new BeanListHandler<WaterOrder>(WaterOrder.class),user_id);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
