package cn.zhku.ajax.domain;

import java.util.List;

public class Province {
	private int pid;
	private String pname;
	private List<City> cityList;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return pname;
	}
	public void setName(String name) {
		this.pname = name;
	}
	public List<City> getCityList() {
		return cityList;
	}
	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	@Override
	public String toString() {
		return "Province [pid=" + pid + ", name=" + pname + ", cityList=" + cityList + "]";
	}
	
	

}
