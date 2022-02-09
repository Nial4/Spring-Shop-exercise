package com.dianchi.ruanjian.service;

import java.sql.SQLException;
import java.util.List;

import com.dianchi.ruanjian.entity.Product;

public interface ProductService {
	//查询最新商品
	List<Product> queryNew()throws SQLException;

	List<Product> queryHot()throws SQLException;
}
