package com.zhku.ShoolPartAndDormitory.domain;

import java.util.List;

public class ShoolPart {
	private String sid;
	private String nsme;
	private List<Dormitory> dormitory;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getNsme() {
		return nsme;
	}
	public void setNsme(String nsme) {
		this.nsme = nsme;
	}
	public List<Dormitory> getDormitory() {
		return dormitory;
	}
	public void setDormitory(List<Dormitory> dormitory) {
		this.dormitory = dormitory;
	}
	@Override
	public String toString() {
		return "ShoolPart [sid=" + sid + ", nsme=" + nsme + ", dormitory="
				+ dormitory + "]";
	}
	

	
}
