package com.dianchi.ruanjian.service;

import java.util.List;

import com.dianchi.ruanjian.entity.Category;

public interface CategoryServcie {
	//查所有
	List<Category> queryAll()throws Exception;
}
