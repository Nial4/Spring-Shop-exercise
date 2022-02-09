package com.dianchi.ruanjian.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dianchi.ruanjian.entity.Category;
import com.dianchi.ruanjian.util.JDBCUtil;

public class CategoryDaoImpl implements CategoryDao {

	public List<Category> selectAll() throws SQLException {
		List<Category> list = new ArrayList<Category>();
		Category c = null;
		//1、创建连接
		Connection con = JDBCUtil.getConnection();
		//2、写sql语句并获取执行对象
		String sql = "select * from category order by cid";
		PreparedStatement ps = con.prepareStatement(sql);
		//3、执行sql
		ResultSet rs = ps.executeQuery();
		//4、处理结果
		while(rs.next()){
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			c = new Category(cid,cname);
			list.add(c);
		}
		//5、关闭资源
		JDBCUtil.closeZiYuan(rs, ps, null);
		return list;
	}

}
