package cn.zhku.user.service;

import cn.zhku.user.dao.DaoFactory;
import cn.zhku.user.dao.UserDao;
import cn.zhku.user.domain.User;

public class UserService {
	
	 private UserDao userDao= DaoFactory.getUserDao();
	
	public void regist(User user) throws UserException{
		User _user = userDao.findByUsername(user.getUsername());
		if(_user != null) throw new UserException("用户名"+user.getUsername()+",已被注册过了！");
		
		userDao.addUser(user);
	}
	public User login(User form) throws UserException {
		User user = userDao.findByUsername(form.getUsername());
		
		
		if(user == null) throw new UserException("用户名不存在！");
		
		if(!form.getPassword().equals(user.getPassword())){
			throw new UserException("密码错误！");
		}
		return user;
		
		
	}

}
