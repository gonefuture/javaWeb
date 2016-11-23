package com.zhku.service;

import java.sql.SQLException;

import com.zhku.dao.ManagerDao;
import com.zhku.domain.Manager;

public class ManagerService {
	ManagerDao managerDao=new ManagerDao();
	
	/**
	 * 登录
	 */
	public Manager login(String name, String password){
		try {
			return managerDao.login(name, password);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	/**
	 * 修改密码
	 * @throws Exception 
	 * @throws UserException 
	 */
	public  void updatePass(String admin_id,String oldPass,String newPass) throws Exception{
		try {
			boolean bool = managerDao.findByIdAndPass(admin_id, oldPass);
			if(!bool){
				throw new Exception("原密码错误！");
			}
			
			managerDao.updatePass(admin_id, newPass);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
