package cn.zhku.user.service;

import cn.zhku.user.dao.UserDaoImpl;
import cn.zhku.user.entity.UserEntity;

public class UserService {
	UserEntity userEntity = new  UserEntity();
	UserDaoImpl userDaoImpl = new UserDaoImpl();
	
	public void regist(UserEntity form) throws UserException {
			//根据用户名查找用户，返回用户实体
			UserEntity user = userDaoImpl.findByUserName(form.getUserName());
			if(user != null) throw new UserException("用户名已被注册");
			userDaoImpl.addUser(form);
		
	}
	
	public UserEntity login(UserEntity form) throws UserException {
		UserEntity user = userDaoImpl.findByUserName(form.getUserName());
		if(userEntity == null)  throw new UserException("用户名不存在");
		if(!user.getUserPass().equals(form.getUserPass()))
			throw new UserException("密码错误");
		return user;
	}

}
