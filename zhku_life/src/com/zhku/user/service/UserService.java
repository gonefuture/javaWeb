package com.zhku.user.service;


import java.util.List;

import com.zhku.user.dao.UserDao;
import com.zhku.user.domain.RepairOrder;
import com.zhku.user.domain.User;
import com.zhku.user.domain.WaterOrder;



public class UserService {
	private UserDao userDao= new UserDao();
	
	public void regist(User form) throws UserException{
		User user =  userDao.findByUserName(form.getUserName());
		if(user != null) throw new UserException("用户名已被注册！");
		
		user = userDao.findByUserPhone(form.getUserPhone());; 
		if(user != null) throw new UserException("电话号码已经被注册！");
		
		userDao.add(form);
	}

	
	public User login(User form) throws UserException{
		
		User user = userDao.findByUserName(form.getUserName());
		if(user == null) throw new UserException("用户名不存在！");
		if(!user.getPassword().equals(form.getPassword()))
			throw new UserException("密码错误");
		return user;
	}
	
	public void bookWater(WaterOrder form)  throws UserException{
		userDao.bookWater(form);
	}
	
	public void repairService(RepairOrder form)  throws UserException{
		userDao.repairService(form);
	}
	
	public List<WaterOrder> findWaterOrder(User form){
		int user_id = form.getUser_id();
		return userDao.findWaterOrder(user_id);
		
	}
}
