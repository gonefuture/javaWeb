package cn.zhku.user.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zhku.user.entity.UserEntity;
import cn.zhku.user.service.UserException;
import cn.zhku.user.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       UserService userService = new UserService();
   	   UserEntity user = new UserEntity();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//
		response.setContentType("text/html;charset=utf-8"); 	
		
		// 通过request来得到提交的表单中的值
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		
		// 填充实体
		user.setUserName(userName);
		user.setUserPass(userPass);									
		
		try {
			userService.login(user);
		} catch (UserException e) {
			request.setAttribute("msg", e.getMessage());
			request.getRequestDispatcher("login.jsp") .forward(request,response);
		}
		request.setAttribute("user", user);
		request.getRequestDispatcher("mainPage_2.jsp") .forward(request,response);
	}

}
