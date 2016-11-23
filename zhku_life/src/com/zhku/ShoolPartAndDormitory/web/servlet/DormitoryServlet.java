package com.zhku.ShoolPartAndDormitory.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.zhku.ShoolPartAndDormitory.dao.Dao;
import com.zhku.ShoolPartAndDormitory.domain.Dormitory;

/**
 * Servlet implementation class DormitoryServlet
 */
@WebServlet("/DormitoryServlet")
public class DormitoryServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		/*
		 * (non-Javadoc)
		 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
		 */
		int sid = Integer.parseInt((request.getParameter("sid")));
		Dao dao = new Dao();
		List<Dormitory> dormitoryList  = dao.findByDormitory(sid);
		
		String json = JSONArray.fromObject(dormitoryList).toString();
		response.getWriter().print(json);
	}

}
