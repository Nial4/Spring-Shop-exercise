package com.dianchi.ruanjian.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.dianchi.ruanjian.entity.Product;
import com.dianchi.ruanjian.util.JDBCUtil;

public class ProductDaoImpl implements ProductDao {

	public List<Product> selectNew() throws SQLException {
		List<Product> list = new ArrayList<Product>();
		Product p = null;
		//获取连接
		Connection con = JDBCUtil.getConnection();
		//写sql获取执行sql对象
		String sql = "select * from product order by pdate desc limit 0,9";
		PreparedStatement ps = con.prepareStatement(sql);
		//执行sql
		ResultSet rs = ps.executeQuery();
		//处理结果
		while(rs.next()){
			int pid = rs.getInt("pid");
			String pname = rs.getString("pname");
			String pimage = rs.getString("pimage");
			Double shopPrice = rs.getDouble("shop_price");
			Date date = rs.getDate("pdate");
			java.util.Date d = new java.util.Date(date.getTime());
			int isHot = rs.getInt("is_hot");
			p = new Product(pid,pname,null,shopPrice,pimage,d,isHot,null,null,null);
			System.out.println(p);
			list.add(p);
		}
		//关闭资源
		JDBCUtil.closeZiYuan(rs, ps, null);
		return list;
	}

	public List<Product> selectHot() throws SQLException {
		List<Product> list = new ArrayList<Product>();
		Product p = null;
		//获取连接
		Connection con = JDBCUtil.getConnection();
		//写sql获取执行sql对象
		String sql = "select * from product where is_hot = ? order by pdate desc limit 0,9";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, 1);
		//执行sql
		ResultSet rs = ps.executeQuery();
		//处理结果
		while(rs.next()){
			int pid = rs.getInt("pid");
			String pname = rs.getString("pname");
			String pimage = rs.getString("pimage");
			Double shopPrice = rs.getDouble("shop_price");
			Date date = rs.getDate("pdate");
			java.util.Date d = new java.util.Date(date.getTime());
			int isHot = rs.getInt("is_hot");
			p = new Product(pid,pname,null,shopPrice,pimage,d,isHot,null,null,null);
			list.add(p);
		}
		//关闭资源
		JDBCUtil.closeZiYuan(rs, ps, null);
		return list;
	}

}
