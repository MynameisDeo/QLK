package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Category;
import com.demo.model.Product;
import com.demo.repository.CategoryRepository;
import com.demo.repository.ProductRepository;

@Service
public class ProductIMP implements ProductSV {

	
	@Autowired
	private ProductRepository productRepository;
	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	@Override
	public Product find(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}
	@Override
	public int quantity(int id) {
		// TODO Auto-generated method stub
		return productRepository.quantity(id);
	}
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}
	
	
	

}
