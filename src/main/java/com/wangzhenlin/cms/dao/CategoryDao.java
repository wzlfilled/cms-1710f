package com.wangzhenlin.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wangzhenlin.cms.pojo.Category;
import com.wangzhenlin.cms.pojo.User;


public interface CategoryDao {

	List<Category> List(Category category);
	
	User ListById(@Param("aid")Integer aid);
	
	int insert(Category category);
	
	int Update(Category category);
	
	int Deletes(@Param("aids")String aids);

}