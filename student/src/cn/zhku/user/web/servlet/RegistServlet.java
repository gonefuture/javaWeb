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
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	
	UserService userService = new UserService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");//
		response.setContentType("text/html;charset=utf-8"); 	
		
		// 通过request来得到提交的表单中的值
		String userName = request.getParameter("userName");
		String userPass = request.getParameter("userPass");
		String age = request.getParameter("age");
		String sex = request.getParameter("sex");
		String email = request.getParameter("email");

		// 填充实体
		UserEntity user = new UserEntity();
		user.setUserName(userName);
		user.setUserPass(userPass);
		user.setSex(sex);
		user.setAge(Integer.parseInt(age));
		user.setEmail(email);
		
		try {
			userService.regist(user);
		} catch (UserException e) {
			request.setAttribute("f", e.getMessage());
		}
		
		request.setAttribute("f", "注册成功,请登录");
		request.getRequestDispatcher("regist.jsp") .forward(request,response);

	}

}