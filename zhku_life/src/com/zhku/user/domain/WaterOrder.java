package com.zhku.user.domain;

import java.util.Date;

public class WaterOrder {
	private String id;
	private int user_id;
	private int admin_id;
	private Date ordertime;
	private Date userduetime;
	private Date duetime;
	private int state;
	
	private String name;//宿管名字
	
	private String userName;//学生名
	private String userPhone;//学生电话
	private String dormitory;//宿舍号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Date getUserduetime() {
		return userduetime;
	}
	public void setUserduetime(Date userduetime) {
		this.userduetime = userduetime;
	}
	public Date getDuetime() {
		return duetime;
	}
	public void setDuetime(Date duetime) {
		this.duetime = duetime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
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
	@Override
	public String toString() {
		return "WaterOrder [id=" + id + ", user_id=" + user_id + ", admin_id="
				+ admin_id + ", ordertime=" + ordertime + ", userduetime="
				+ userduetime + ", duetime=" + duetime + ", state=" + state
				+ ", name=" + name + ", userName=" + userName + ", userPhone="
				+ userPhone + ", dormitory=" + dormitory + "]";
	}
	
	

}
