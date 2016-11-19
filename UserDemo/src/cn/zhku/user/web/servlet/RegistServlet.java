package cn.zhku.user.web.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import cn.itcast.commons.CommonUtils;
import cn.zhku.user.domain.User;
import cn.zhku.user.service.UserException;
import cn.zhku.user.service.UserService;


	public class RegistServlet extends HttpServlet {
	/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	/**
		 * 
		 */


	public  void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//
		response.setContentType("text/html;charset=utf-8");  

				/*PrintWriter out = response.getWriter(); 
				out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
				out.println("<HTML>");
				out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
				out.println("  <BODY>");
				out.println("请去注册页面注册!");
				out.println("  </BODY>");
				out.println("</HTML>");
				out.flush();
				out.close();*/
				UserService userService =new  UserService();
				
				User form = CommonUtils.toBean(request.getParameterMap(), User.class);
				
				try{
					userService.regist(form);
					response.getWriter().print("<h1>注册成功！</h1><a href='"+
					request.getContextPath()+
					"/user/login.jsp"+"'>点击这里去登录</a>");
				} catch (UserException e) {
					
					request.setAttribute("msg", e.getMessage());
					request.setAttribute("user", form);
					request.getRequestDispatcher("/user/regist.jsp").forward(request, response);
				}

			}
	
		


}
