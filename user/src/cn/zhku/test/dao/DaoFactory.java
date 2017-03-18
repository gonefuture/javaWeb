package cn.zhku.test.dao;

import java.io.InputStream;
import java.util.Properties;

public class DaoFactory {
	/*	工厂接口
	 * 1.初始化UserDao对象和创建自身instance对象
	 * 2.读取properties文件
	 * 3.通过反射创建UserDao对象
	 * 4.创建返回UserDao对象和instance对象的方法
	 */
	
	//创建的次序是一定的。
	private static UserDao userDao = null;
	private static DaoFactory instance = new DaoFactory();
	
	DaoFactory(){
		try{
		Properties prop = new Properties();
		//从 "/src" 读取properties文件
		InputStream inStream = DaoFactory.class.getClassLoader()
				.getResourceAsStream("daoconfig.properties");
		prop.load(inStream);
		
		//通过反射方式创建对象
		String userDaoClzz = prop.getProperty("userDaoFactory");  
		Class<?> clazz = Class.forName("cn.zhku.test.dao.UserDaoJdbcImpl");
		userDao = (UserDao)  clazz.newInstance();
		}  catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public static DaoFactory getInstance(){
		return instance;
	}
	
	public static UserDao getUserDao(){
		return userDao;
	}

}
