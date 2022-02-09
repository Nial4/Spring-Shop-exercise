package com.dianchi.ruanjian.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.dianchi.ruanjian.dao.CategoryDao;
import com.dianchi.ruanjian.dao.CategoryDaoImpl;
import com.dianchi.ruanjian.entity.Category;
import com.dianchi.ruanjian.util.JDBCUtil;

public class CategoryServiceImpl implements CategoryServcie{

	public List<Category> queryAll() throws Exception {
		//1、创建连接
		Connection con = JDBCUtil.getConnection();
		List<Category> list = null;
		try {
			//2、设置事务为手动提交
			con.setAutoCommit(false);
			//3、调用dao方法查所有
			CategoryDao cd = new CategoryDaoImpl();
			list = cd.selectAll();
			//4、提交事务
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally {
			//5、关闭连接
			JDBCUtil.closeZiYuan(null, null, con);
		}
		return list;
	}

}
