package cn.zhku.test.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.commons.CommonUtils;
import cn.zhku.test.domain.User;
import cn.zhku.test.service.UserException;
import cn.zhku.test.service.UserService;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	UserService userService = new UserService();
	public void doPost(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		
		request.setCharacterEncoding("utf-8");//
		response.setContentType("text/html;charset=utf-8"); 
		
		User form = CommonUtils.toBean(request.getParameterMap(), User.class);//封装实体类
		try {
			userService.login(form);
			response.sendRedirect("msg.jsp");
		} catch (UserException e) {
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			request.getRequestDispatcher("msg.jsp") .forward(request,response);
		}	
	}

}
