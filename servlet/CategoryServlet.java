package com.dianchi.ruanjian.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dianchi.ruanjian.entity.Category;
import com.dianchi.ruanjian.service.CategoryServcie;
import com.dianchi.ruanjian.service.CategoryServiceImpl;

import net.sf.json.JSONArray;


public class CategoryServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//根据请求参数选择执行哪个方法
		String methodName = req.getParameter("methodName");
		if("queryAll".equals(methodName)){
			queryAll(req,resp);
		}
	}
	public void queryAll(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException{
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		CategoryServcie cs  = new CategoryServiceImpl();
		try {
			//1、调用service方法查所有
			List<Category> list = cs.queryAll();
			//2、将list转为json
			JSONArray json = JSONArray.fromObject(list);
			//3、响应
			resp.getWriter().println(json.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
