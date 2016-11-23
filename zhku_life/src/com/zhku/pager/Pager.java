package com.zhku.pager;

import java.util.List;

public class Pager<T> {
	private int pc;//当前页码
	private int tr;//总记录数
	private int ps;//每页记录数
	private String url;//请求路径和参数，例如：/BookServlet?method=findXXX&cid=1&bname=2
	private List<T> beanList; //根据条件查到的记录
	
	// 计算总页数
	public int getTp() {
		int tp = tr / ps;
		return tr % ps == 0 ? tp : tp + 1;
	}
	
	public int getPc() {
		return pc;
	}
	public void setPc(int pc) {
		this.pc = pc;
	}
	public int getTr() {
		return tr;
	}
	public void setTr(int tr) {
		this.tr = tr;
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		this.ps = ps;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public List<T> getBeanList() {
		return beanList;
	}
	public void setBeanList(List<T> beanList) {
		this.beanList = beanList;
	}

	@Override
	public String toString() {
		return "Pager [pc=" + pc + ", tr=" + tr + ", ps=" + ps + ", url=" + url + ", beanList=" + beanList + "]";
	}
	
}
