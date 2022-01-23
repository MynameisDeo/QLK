package com.demo.services;




import java.util.List;

import com.demo.model.Category;


public interface CategorySV {
	
	public Iterable<Category> findAll();
	
	public Category save(Category category);
	
	public Category find(int id);
	
	public void delete(int id);
	
	public List<Category> findByName(String name);

}
