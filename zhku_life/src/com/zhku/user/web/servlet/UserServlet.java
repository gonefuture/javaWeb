package com.zhku.user.web.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhku.user.domain.User;
import com.zhku.user.domain.WaterOrder;
import com.zhku.user.service.UserException;
import com.zhku.user.service.UserService;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
	
	UserService userService = new UserService();

	public String  regist(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
			User form =  CommonUtils.toBean(request.getParameterMap(),User.class);
			
			
			Map<String,String> errors  = new HashMap<String ,String>();
			
			String username = form.getUserName();
			if(username == null || username.trim().isEmpty()){
				errors.put("username", "用户名不能空！");			
			}else if(username.length() > 15){
				errors.put("userName", "用户名长度必须在3~10之间");
			}
			
			String password = form.getPassword();
			if(password == null || password.trim().isEmpty()){
				errors.put("password", "密码不能空！");			
			}else if(password.length() < 3 || password.length() > 10){
				errors.put("password", "密码长度必须在3~10之间");
			}
			
			String userPhone = form.getUserPhone();
			if(userPhone == null || userPhone.trim().isEmpty()){
				errors.put("userPhone", "电话号码不能为空！");			
			}else if(userPhone.length() != 11){
				errors.put("userPhone", "电话长度必须等于11");
			}
			
			if(errors.size() > 0){
				request.setAttribute("errors", errors);
				request.setAttribute("form", form);
				return "f:/user/myjsp/msg.jsp";
			}
			
			try{
				userService.regist(form);
			
			} catch (UserException e){
				request.setAttribute("msg", e.getMessage());
				request.setAttribute("form", form);
				return "f:/user/register.jsp";
			}
			request.setAttribute("msg", "恭喜，注册成功，跳转中");
			return "f:/user/home.jsp";	
	}
	
	public String login(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		
		User form = CommonUtils.toBean(request.getParameterMap(), User.class);
		try {
			User user = userService.login(form);
			request.getSession().setAttribute("session_user", user);
			
			
			return "f:/user/home.jsp";
		} catch (UserException e) {
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			return "f:/user/myjsp/login.jsp";
		}	
		
	}
	
	public String quit(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		request.getSession().invalidate();
		return "r:/login.jsp";
		
	}
	
	public String bookWater(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		WaterOrder form =  CommonUtils.toBean(request.getParameterMap(),WaterOrder.class);
		form.setId(CommonUtils.uuid());
		
		Date ordertime = new Date();
		form.setOrdertime(ordertime);
		
		User user = (User) request.getAttribute("session_user");
		form.setUser_id(user.getUser_id());
		
		
		try {
			userService.bookWater(form);
		} catch (UserException e) {
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			return "f:/user/home.jsp";
		}
		
		return "r:/user/home.jsp";
		
	}
	
	public String repairService(HttpServletRequest request,HttpServletResponse response)
			throws ServletException,IOException{
		
		WaterOrder form =  CommonUtils.toBean(request.getParameterMap(),WaterOrder.class);
		form.setId(CommonUtils.uuid());
		
		Date ordertime = new Date();
		form.setOrdertime(ordertime);
		
		User user = (User) request.getAttribute("session_user");
		form.setUser_id(user.getUser_id());
		
		try{
			userService.bookWater(form);
		
		} catch (UserException e){
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			return "f:/user/home.jsp";
		}
		
		return "f:/user/home.jsp";		
	}
	
	public String findWaterOrder(HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		User form = (User) request.getAttribute("session_user");
		request.setAttribute("WaterOrderList", userService.findWaterOrder(form));
		return "f:/user/myjsp/waterOrderList.jsp";
		
	}
	
	

}
