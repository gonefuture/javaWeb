package com.zhku.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.zhku.domain.Manager;

import cn.itcast.jdbc.TxQueryRunner;

public class ManagerDao {
	private QueryRunner qr=new TxQueryRunner();
	
	/**
	 * 登录
	 * @throws SQLException 
	 */
	public Manager login(String name, String password) throws SQLException {
		String sql="select * from manager where name=? and password=?";
		Manager m=qr.query(sql, new BeanHandler<Manager>(Manager.class),name,password);
		return m;
	}
	
	/**
	 * 通过id和密码判断用户是否存在
	 * @throws SQLException 
	 */
	public boolean findByIdAndPass(String admin_id,String password) throws SQLException{
		String sql="select count(*) from manager where name=? and password=?";
		Number number=(Number) qr.query(sql, new ScalarHandler(), admin_id,password);
		return number.intValue()>0;
	}
	
	/**
	 * 修改密码
	 * @throws SQLException 
	 */
	public void updatePass(String admin_id, String newPass) throws SQLException{
		String sql="update manager set password=? where admin_id=?";
		qr.update(sql,newPass,admin_id);
	}
	
}
