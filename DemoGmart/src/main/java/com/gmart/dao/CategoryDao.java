package com.gmart.dao;

import java.util.List;

import com.gmart.model.Category;

public interface CategoryDao {
	public boolean addCategory(Category category);
	public boolean deleteCategory(Category cat);
	public boolean updateCategory(Category cat);

	public List<Category> listCategorys();
	public Category getCategory(int categorytId);
}
