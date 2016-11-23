package com.zhku.ShoolPartAndDormitory.domain;

public class Dormitory {
	private int did;
	private String name;
	private ShoolPart shoolPart;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ShoolPart getShoolPart() {
		return shoolPart;
	}
	public void setShoolPart(ShoolPart shoolPart) {
		this.shoolPart = shoolPart;
	}
	@Override
	public String toString() {
		return "Dormitory [did=" + did + ", name=" + name + ", shoolPart="
				+ shoolPart + "]";
	}
	
}
