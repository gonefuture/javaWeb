package cn.zhku.test.service;

import cn.zhku.test.dao.DaoFactory;
import cn.zhku.test.dao.UserDao;
import cn.zhku.test.domain.User;

public class UserService {
	UserDao userDao = DaoFactory.getInstance().getUserDao();

	public void regist(User form) throws UserException{
/*		User user =  userDao.findByUsername(form.getUsername());
		if(user != null) throw new UserException("用户名已被注册！");
		
		user = userDao.findByEmail(form.getEmail());; 
		if(user != null) throw new UserException("Email已经被注册！");
		
		user = userDao.findByPhone(form.getPhone()); 
		if(user != null) throw new UserException("手机号已经被注册！");
*/		
		userDao.addUser(form);
	}

	public User login(User form) throws UserException {
		User user = userDao.findByUsername(form.getUsername());
		if(user == null) throw new UserException("用户名不存在！");
		
		if(!user.getPassword().equals(form.getPassword()))
			throw new UserException("密码错误");
		return user;
	}

}
