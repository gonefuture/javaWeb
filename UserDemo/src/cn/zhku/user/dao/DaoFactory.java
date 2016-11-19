package cn.zhku.user.dao;
import java.io.InputStream;
import java.util.Properties;

public class DaoFactory {
	/*
	 *  * 通过配置文件得到Dao实现类的名称
	 * 通过类名称，获取实现类的类名，通过反射完成创建对象
	 */
	private static Properties props = null;
	
	static {
		try{
		InputStream in = DaoFactory.class.getClassLoader()
				.getResourceAsStream("dao.properties");
		 props = new Properties();
		 props.load(in);
		}catch(Exception e ){
			throw new RuntimeException(e);
		}
	}
	public static UserDao getUserDao() {
		/*
		 * 
		 */
		//得到实现类名称
		String daoClassName = props.getProperty("cn.zhku.user.dao.UserDao");
		try{
			Class<?> clazz = Class.forName(daoClassName);
			//System.out.println("转换前");
			return  (UserDao) clazz.newInstance();
			
			
		}catch(Exception e){
			throw new RuntimeException(e);
			
		}
	 
		
	}
	
}
