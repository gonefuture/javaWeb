package cn.zhku.ajax.domain;

public class City {
	private int cid;
	private String cname;
	private Province province;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return cname;
	}
	public void setName(String name) {
		this.cname = name;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	
	
	@Override
	public String toString() {
		return "City [cid=" + cid + ", name=" + cname + ", province=" + province + "]";
	}
	

}
