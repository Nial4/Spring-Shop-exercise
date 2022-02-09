package com.dianchi.ruanjian.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dianchi.ruanjian.entity.Product;
import com.dianchi.ruanjian.service.ProductService;
import com.dianchi.ruanjian.service.ProductServiceImpl;

/**
 * Servlet implementation class ProductServlet
 */
public class ProductServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//根据请求参数选择执行哪个方法
		String methodName = req.getParameter("methodName");
		if("home".equals(methodName)){
			homeProduct(req,resp);
		}
	}
	public void homeProduct(HttpServletRequest req,HttpServletResponse resp) throws UnsupportedEncodingException{
		//设置request字符集
		req.setCharacterEncoding("UTF-8");
		//设置response字符集
		resp.setCharacterEncoding("UTF-8");
		//调service方法查最新商品和热门商品
		ProductService ps = new ProductServiceImpl();
		List<Product> listNew;
		List<Product> listHot;
		try {
			listNew = ps.queryNew();
			listHot = ps.queryHot();
			req.setAttribute("listNew", listNew);
			req.setAttribute("listHot", listHot);
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
