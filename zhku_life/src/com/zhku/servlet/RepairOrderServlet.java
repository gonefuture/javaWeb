package com.zhku.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhku.domain.Manager;
import com.zhku.domain.RepairOrder;
import com.zhku.pager.Pager;
import com.zhku.service.RepairOrderService;

import cn.itcast.servlet.BaseServlet;



public class RepairOrderServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	
	RepairOrderService repairOrderService=new RepairOrderService();
       
	/**
	 * 获取当前页码
	 * @param req
	 * @return
	 */
	private int getPc(HttpServletRequest req) {
		int pc = 1;
		String param = req.getParameter("pc");
		if(param != null && !param.trim().isEmpty()) {
			try {
				pc = Integer.parseInt(param);
			} catch(RuntimeException e) {}
		}
		return pc;
	}
	
	/**
	 * 截取url，页面中的分页导航中需要使用它做为超链接的目标！
	 * @param req
	 * @return
	 */
	private String getUrl(HttpServletRequest req) {
		String url = req.getRequestURI() + "?" + req.getQueryString();
		/*
		 * 如果url中存在pc参数，截取掉，如果不存在那就不用截取。
		 */
		int index = url.lastIndexOf("&pc=");
		if(index != -1) {
			url = url.substring(0, index);
		}
		return url;
	}
   
	/**
	 * 查询各种状态的订单
	 */
    public String findOrder(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//1. 得到pc：如果页面传递，使用页面的，如果没传，pc=1
		int pc = getPc(req);
		
		//2. 得到url
		String url = getUrl(req);
		
		
		
		String state = req.getParameter("state");
		
		System.out.println("pc:"+pc+"--url:"+url+"--status:"+state);
		
		Pager<RepairOrder> pager = repairOrderService.findOrder(state, pc);
		System.out.println(pager);
		
		pager.setUrl(url);
		req.setAttribute("pager", pager);
		if("0".equals(state)){
			return "f:/admin/dormAdmin/newOrder.jsp";
		}else if("1".equals(state)){
			return "f:/admin/dormAdmin/checkedOrder.jsp";
		}else{
			return "f:/admin/dormAdmin/finishOrder.jsp";
		}
	}
    
    /**
     * 接单
     */
    public String checkOrder(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
    	
		String userId = req.getParameter("userId");
		String repairOrderId = req.getParameter("repairOrderId");
		repairOrderService.checkOrder(userId, repairOrderId);
		
		
		int pc = 1;
		String url =req.getRequestURI()+"?method=findNewOrder&state=0";
		
		String state = "0";
		
		System.out.println("自己拼的："+"pc:"+pc+"--url:"+url+"--status:"+state);
		
		Pager<RepairOrder> pager = repairOrderService.findOrder(state, pc);
		System.out.println(pager);
		
		pager.setUrl(url);
		req.setAttribute("pager", pager);
		return "f:/admin/dormAdmin/newOrder.jsp";
	}
    /**
     * 确认维修
     */
    public String confirmOrder(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	String userId = req.getParameter("userId");
		String repairOrderId = req.getParameter("repairOrderId");
    	Manager dormAdmin = (Manager) req.getSession().getAttribute("sessionUser");
    	repairOrderService.confirmOrder(userId, repairOrderId, dormAdmin.getAdmin_id());
    	
    	int pc = 1;
    	String url =req.getRequestURI()+"?method=findNewOrder&oOrderStatus=1";
    	
    	String state = "1";
		
		System.out.println("自己拼的："+"pc:"+pc+"--url:"+url+"--status:"+state);
		
		Pager<RepairOrder> pager = repairOrderService.findOrder(state, pc);
    	System.out.println(pager);
    	
    	pager.setUrl(url);
    	req.setAttribute("pager", pager);
    	return "f:/admin/dormAdmin/checkedOrder.jsp";
    }

}
