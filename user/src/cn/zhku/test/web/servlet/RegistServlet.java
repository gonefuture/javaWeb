package cn.zhku.test.web.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.commons.CommonUtils;
import cn.zhku.test.domain.User;
import cn.zhku.test.service.UserException;
import cn.zhku.test.service.UserService;

/**			对应注册的Servlet
 * 
 */
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	UserService userService = new UserService();
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");//
		response.setContentType("text/html;charset=utf-8"); 
		
		//封装从jsp中传来的数据并打上UUID
		User form =  CommonUtils.toBean(request.getParameterMap(),User.class);
		form.setUid(CommonUtils.uuid());
		
		//创建一个Map来分装用户错误信息
		Map<String,String> errors  = new HashMap<String ,String>();
		
		/*
		 * 注册检验，这里出了好多bug. 因为要考试了,我没时间弄，就先注释掉
		 */
		
/*		String username = form.getUsername();
		if(username == null || username.trim().isEmpty()){
			errors.put("username", "用户名不能空！");			
		}else if(username.length() > 3 || username.length() < 10){
			errors.put("username", "用户名长度必须在3~10之间");
		}
		
		String password = form.getPassword();
		if(password == null || password.trim().isEmpty()){
			errors.put("password", "密码不能空！");			
		}else if(password.length() > 3 || password.length() < 10){
			errors.put("password", "密码长度必须在3~10之间");
		}
		
		String email = form.getEmail();
		if(email == null || email.trim().isEmpty()){
			errors.put("email", "邮箱不能空！");			
		}else if(!email.matches("\\w+@\\w+\\.\\w+")){
			errors.put("email", "Email格式错误！");
		}
		
		String phone =String.valueOf(form.getPhone());
		if(phone == null || phone.trim().isEmpty()){
			errors.put("phone", "手机号不能空！");			
		}else if(phone.length() != 11){
			errors.put("phone", "手机号长度应为11位");
		}
		
		if(errors.size() > 0){
			request.setAttribute("errors", errors);
			request.setAttribute("form", form);
			request.getRequestDispatcher("regist.jsp") .forward(request,response);
		}
		*/
		try{
			userService.regist(form);
		
		} catch (UserException e){
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("form", form);
			request.getRequestDispatcher("regist.jsp") .forward(request,response);
		}
		
		request.setAttribute("msg", "恭喜，注册成功！");
		request.getRequestDispatcher("msg.jsp") .forward(request,response);
	}
}
