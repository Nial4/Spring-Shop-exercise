package com.dianchi.ruanjian.dao;

import java.sql.SQLException;
import java.util.List;

import com.dianchi.ruanjian.entity.Product;

public interface ProductDao {
	//查最新商品
	List<Product> selectNew()throws SQLException;

	List<Product> selectHot() throws SQLException;
}
