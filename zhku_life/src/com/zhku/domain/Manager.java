package com.zhku.domain;

public class Manager {
	private String admin_id;
	private int role;//1:宿管，2：叫水
	private String name;
	private String password;
	private String telephone;
	private String schoolpart;
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getSchoolpart() {
		return schoolpart;
	}
	public void setSchoolpart(String schoolpart) {
		this.schoolpart = schoolpart;
	}
	@Override
	public String toString() {
		return "Manger [admin_id=" + admin_id + ", role=" + role + ", name=" + name + ", password=" + password
				+ ", telephone=" + telephone + ", schoolpart=" + schoolpart + "]";
	}
	
	
}
