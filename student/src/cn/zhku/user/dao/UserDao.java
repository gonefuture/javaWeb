package cn.zhku.user.dao;


import cn.zhku.user.entity.UserEntity;

public interface UserDao {
	UserEntity findByUserName(String userName);
	
	UserEntity findByEmail(String email);
	
	void addUser(UserEntity userEntity);
	
	
	

}
