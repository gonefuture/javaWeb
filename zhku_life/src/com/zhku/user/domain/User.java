package com.zhku.user.domain;

public class User {
	private int user_id;
	private String userPhone;
	private String userName;
	private String password;
	private String shoolpart;
	private String dormitory;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getShoolpart() {
		return shoolpart;
	}
	public void setShoolpart(String shoolpart) {
		this.shoolpart = shoolpart;
	}
	public String getDormitory() {
		return dormitory;
	}
	public void setDormitory(String dormitory) {
		this.dormitory = dormitory;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", userPhone=" + userPhone
				+ ", userName=" + userName + ", password=" + password
				+ ", shoolpart=" + shoolpart + ", dormitory=" + dormitory + "]";
	}

}
