package cn.zhku.test.dao;

import cn.zhku.test.domain.User;

public interface UserDao {

	User findByUsername(String username);

	User findByEmail(String email);

	void addUser(User form);

	User findByPhone(int phone);

}
