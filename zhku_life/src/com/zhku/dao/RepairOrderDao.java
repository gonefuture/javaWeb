package com.zhku.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.zhku.domain.RepairOrder;
import com.zhku.pager.Pager;

import cn.itcast.jdbc.TxQueryRunner;

public class RepairOrderDao {
	private QueryRunner qr=new TxQueryRunner();
	
	/**
	 * 通用的查询方法
	 */
	private Pager<RepairOrder> findByCriteria(String state, int pc){

		int ps=10;
		
		
		String sql="select count(*) from repairorder where state=?";
		Number number = null;
		try {
			number = (Number) qr.query(sql, new ScalarHandler(),state);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		int tr=number.intValue();
		
		if("2".equals(state)){
			sql="select * from repairorder r,user u,manager m where r.state=? and m.schoolpart=u.schoolpart and r.user_id=u.user_id and r.admin_id=m.admin_id limit ?,?";
			
		}else{
			sql="select * from repairorder r,user u where r.state=? and m.schoolpart=u.schoolpart and r.user_id=u.user_id limit ?,?";
		}
		List<RepairOrder> beanList = null;
		int firstRecord=(pc-1) * ps;//当前页的第一行
		try {
			beanList = qr.query(sql, new BeanListHandler<RepairOrder>(RepairOrder.class), 
					state,firstRecord,ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Pager<RepairOrder> pager = new Pager<RepairOrder>();
		
		pager.setBeanList(beanList);
		pager.setPc(pc);
		pager.setPs(ps);
		pager.setTr(tr);
		
		return pager;

	}
	
	/**
	 * 分页查询各种状态的报单  0:新的报单       1：审核过的       2：已维修
	 */
	public Pager<RepairOrder> findOrder(String state,int pc){
		return findByCriteria(state,pc);
	}
	
	/**
	 * 审核新的报单
	 */
	public boolean checkOrder(String userId, String repairOrderId) {
		int count=0;
		String sql="update repairorder set dealtime=?,state=? where user_id=? and repairOrder_id=?";
		try {
			count=qr.update(sql, new Date(),1,userId,repairOrderId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count>0?true:false;
	}
	
	
	
	/**
	 * 确认待维修 的报单
	 */
	public boolean confirmOrder(String userId, String repairOrderId, String adminId) {
		int count=0;
		String sql="update repairorder set finishTime=?,state=? admin_id=? where user_id=? and repairOrder_id=?";
		try {
			count=qr.update(sql,new Date(),2,adminId,userId,repairOrderId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count>0?true:false;
	}
	


	
}
