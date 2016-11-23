package com.zhku.domain;

import java.util.Date;

public class RepairOrder {
	private String repairOrder_id;
	private int user_id;
	private int admin_id;
	private Date ordertime;
	private Date dealtime;
	private Date finishTime;
	private String question;
	private int state;
	
	private String name;//宿管名字
	
	private String userName;//学生名
	private String userPhone;//学生电话
	private String dormitory;//宿舍号
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	public String getRepairOrder_id() {
		return repairOrder_id;
	}
	public void setRepairOrder_id(String repairOrder_id) {
		this.repairOrder_id = repairOrder_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public Date getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	public Date getDealtime() {
		return dealtime;
	}
	public void setDealtime(Date dealtime) {
		this.dealtime = dealtime;
	}
	public Date getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "RepairOrder [repairOrder_id=" + repairOrder_id + ", user_id=" + user_id + ", admin_id=" + admin_id
				+ ", ordertime=" + ordertime + ", dealtime=" + dealtime + ", finishTime=" + finishTime + ", question="
				+ question + ", state=" + state + ", name=" + name + ", userName=" + userName + ", userPhone="
				+ userPhone + ", dormitory=" + dormitory + "]";
	}
	
	
	
}
