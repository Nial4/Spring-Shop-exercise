package com.dianchi.ruanjian.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.dianchi.ruanjian.dao.ProductDao;
import com.dianchi.ruanjian.dao.ProductDaoImpl;
import com.dianchi.ruanjian.entity.Product;
import com.dianchi.ruanjian.util.JDBCUtil;

public class ProductServiceImpl implements ProductService {

	public List<Product> queryNew()throws SQLException {
		//获取连接
		Connection con = JDBCUtil.getConnection();
		List<Product> list = null;
		//设置事务为手动提交
		try {
			con.setAutoCommit(false);
			//调用dao方法查最新商品
			ProductDao pd = new ProductDaoImpl();
			list = pd.selectNew();
			//提交事务
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			JDBCUtil.closeZiYuan(null, null, con);
		}
		
		return list;
	}

	public List<Product> queryHot()throws SQLException {
		//获取连接
		Connection con = JDBCUtil.getConnection();
		List<Product> list = null;
		//设置事务为手动提交
		try {
			con.setAutoCommit(false);
			//调用dao方法查最新商品
			ProductDao pd = new ProductDaoImpl();
			list = pd.selectHot();
			//提交事务
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			JDBCUtil.closeZiYuan(null, null, con);
		}
		
		return list;
	}

}
