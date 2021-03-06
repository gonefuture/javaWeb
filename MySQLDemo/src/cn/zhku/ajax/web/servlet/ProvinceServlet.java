package cn.zhku.ajax.web.servlet;

import cn.itcast.servlet.BaseServlet;
import cn.zhku.ajax.dao.Dao;
import cn.zhku.ajax.domain.City;
import cn.zhku.ajax.domain.Province;
import net.sf.json.JSONArray;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProvinceServlet
 */
@WebServlet("/ProvinceServlet")
public class ProvinceServlet extends HttpServlet {
       
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		Dao dao = new Dao();
		List<Province> provinceList = dao.findAllProvince();
		
		String json =JSONArray.fromObject(provinceList).toString();
		response.getWriter().print(json);
	}
}
