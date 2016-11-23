package com.zhku.service;

import com.zhku.dao.RepairOrderDao;
import com.zhku.domain.RepairOrder;
import com.zhku.pager.Pager;

public class RepairOrderService {
	RepairOrderDao repairOrderDao=new RepairOrderDao();
	
	/**
	 * 查询各种状态的订单
	 * @param state
	 * @param pc
	 * @return
	 */
	public Pager<RepairOrder> findOrder(String state,int pc){
		return repairOrderDao.findOrder(state, pc);
	}
	
	/**
	 * 审核新的订单
	 * @param userId
	 * @param repairOrderId
	 * @return
	 */
	public boolean checkOrder(String userId, String repairOrderId) {
		return repairOrderDao.checkOrder(userId, repairOrderId);
	}
	
	/**
	 * 确认带维修单
	 * @param userId
	 * @param repairOrderId
	 * @param adminId
	 * @return
	 */
	public boolean confirmOrder(String userId, String repairOrderId, String adminId) {
		return repairOrderDao.confirmOrder(userId, repairOrderId, adminId);
	}
}
