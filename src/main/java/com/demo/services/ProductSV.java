package com.demo.services;




import java.util.List;

import com.demo.model.Category;
import com.demo.model.Product;


public interface ProductSV {
	
	public Iterable<Product> findAll();
	
	public Product find(int id);
	
	public int quantity(int id);
	
	public Product save(Product product);

}
