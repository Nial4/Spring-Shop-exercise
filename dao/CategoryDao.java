package com.dianchi.ruanjian.dao;

import java.sql.SQLException;
import java.util.List;

import com.dianchi.ruanjian.entity.Category;

public interface CategoryDao {
	//查所有
	List<Category> selectAll()throws SQLException;
}
