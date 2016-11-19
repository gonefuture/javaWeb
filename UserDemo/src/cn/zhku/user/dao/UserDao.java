package cn.zhku.user.dao;

import cn.zhku.user.domain.User;

public interface UserDao {
	public void addUser(User form);
	public User findByUsername(String username);
	

}
