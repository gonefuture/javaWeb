package cn.zhku.ajax.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.jdbc.TxQueryRunner;
import cn.zhku.ajax.domain.City;
import cn.zhku.ajax.domain.Province;

public class Dao {
	private QueryRunner qr = new TxQueryRunner();
	
	public List<Province> findAllProvince() {
		
		try{
				String sql  ="select * from t_province";
		return qr.query(sql, new BeanListHandler<Province>(Province.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<City> findByProvince(int pid){
		try{
			String sql  ="select * from t_city where pid=?";
			//List<Map<String,Object>> mapList = qr.query(sql, new MapListHandler(),pid);
			//System.out.println(mapList.get(0));
			return qr.query(sql, new BeanListHandler<City>(City.class),pid);
		} catch (SQLException e) {
		throw new RuntimeException(e);
		}
	}
	
/*	public static void main(String[] args){
		Dao dao = new Dao();
		dao.findByProvince(1);
	}*/

}
