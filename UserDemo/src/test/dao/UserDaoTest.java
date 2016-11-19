package test.dao;

import static org.junit.Assert.*;
import org.junit.Test;

import cn.zhku.user.dao.UserDaoImpl;
import cn.zhku.user.domain.User;

public class UserDaoTest {
	@Test
	public void testFindByUsername(){
		UserDaoImpl userDao = new UserDaoImpl();
		User user = userDao.findByUsername("钱伟健");
		System.out.println(user);
	}

	@Test
	public void tsetAdd(){
		UserDaoImpl userDao = new UserDaoImpl();
		User user =new User();
		user.setUsername("渣渣");
		user.setPassword("123");
		userDao.add(user);
		
	}
	
}
