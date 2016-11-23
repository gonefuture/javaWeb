package com.zhku.ShoolPartAndDormitory.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import cn.itcast.jdbc.TxQueryRunner;

import com.zhku.ShoolPartAndDormitory.domain.Dormitory;
import com.zhku.ShoolPartAndDormitory.domain.ShoolPart;

public class Dao {
	private QueryRunner qr = new TxQueryRunner();
	
	public List<ShoolPart>  findAllShoolPart(){
		
		try {
			String sql ="select * from shoolpart ";
			return qr.query(sql, new BeanListHandler<ShoolPart>(ShoolPart.class));
		} catch (SQLException e) {
			 throw new RuntimeException(e);
		}
	}
	
	public List<Dormitory>  findByDormitory(int sid){
		try {
			String sql ="select * from dormitory where sid=?";
			return qr.query(sql, new BeanListHandler<Dormitory>(Dormitory.class),sid);
		} catch (SQLException e) { 
			 throw new RuntimeException(e);
		}
	}

}
