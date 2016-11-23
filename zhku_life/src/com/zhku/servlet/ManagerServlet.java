package com.zhku.servlet;

import cn.itcast.commons.CommonUtils;
import cn.itcast.servlet.BaseServlet;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zhku.domain.Manager;
import com.zhku.service.ManagerService;


public class ManagerServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	ManagerService managerSerivce =new ManagerService();
	
	/**
	 * 校验验证码是否正确
	 */
	public String ajaxValidateVerifyCode(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1.获取输入框验证码
		String verifyCode = req.getParameter("verifyCode");

		// 2.从session中获取到正确的验证码
		String vCode = (String) req.getSession().getAttribute("vCode");

		// 3.两者忽略大小写进行比较
		boolean bool = verifyCode.equalsIgnoreCase(vCode);

		// 4.将结果返回给客户端
		resp.getWriter().println(bool);
		return null;
	}
       
	/**
	 * 登录
	 */
	public String login(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name=req.getParameter("loginname");
		String password=req.getParameter("loginpass");
		
		System.out.println(name+"---"+password);
		Manager formUser=new Manager();
		formUser.setName(name);
		formUser.setPassword(password);
		
		Manager manager = managerSerivce.login(name,password);
		
		System.out.println(manager);
		
		if(manager == null) {
			req.setAttribute("msg", "用户名或密码错误！");
			req.setAttribute("form", formUser);
			return "f:/admin/logIn.jsp";
		} else {

			// 保存用户到session
			req.getSession().setAttribute("sessionUser", manager);
			// 获取用户名保存到cookie中
			String loginname = manager.getName();
			loginname = URLEncoder.encode(loginname, "utf-8");
			Cookie cookie = new Cookie("loginname", loginname);
			cookie.setMaxAge(60 * 60 * 24 * 10);// 保存10天
			resp.addCookie(cookie);
			return "f:/admin/dormAdmin/newOrder.jsp";
			
		}
	}
	
	/**
	 * 修改密码功能
	 */
	public String updatePass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String oldPass = req.getParameter("loginpass");
		String newPass = req.getParameter("newloginpass");
		String reNewPass = req.getParameter("reloginpass");
		
		//2.从session中获取用户信息,没有登录时跳转到登录页面
		Manager sessionManager=(Manager) req.getSession().getAttribute("sessionUser");
		
		
		//3.修改密码
		try {
			managerSerivce.updatePass(sessionManager.getAdmin_id(), oldPass, reNewPass);
			req.setAttribute("updateSuccess", "密码修改成功！");
		} catch (Exception e) {
			//保存错误信息，并跳转到修改密码页面
			req.setAttribute("msg", e.getMessage());
		}
		return "f:/admin/updateInfo.jsp";
		
	}

}
