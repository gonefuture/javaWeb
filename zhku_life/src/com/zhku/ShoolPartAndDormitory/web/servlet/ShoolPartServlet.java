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
import com.zhku.ShoolPartAndDormitory.domain.ShoolPart;

/**
 * Servlet implementation class ShoolPartServlet
 */
@WebServlet("/ShoolPartServlet")
public class ShoolPartServlet extends HttpServlet {
	public void doGet (HttpServletRequest request, HttpServletResponse response)
			throws ServletException,IOException{
		response.setContentType("text/html;charset=utf-8");
		
		Dao dao = new Dao();
		List<ShoolPart> shoolPartList = dao.findAllShoolPart();
		String json = JSONArray.fromObject(shoolPartList).toString();
		
		response.getWriter().print(json);		
	}
}
