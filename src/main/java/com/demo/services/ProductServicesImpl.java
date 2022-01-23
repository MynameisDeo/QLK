package com.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.models.Product;
import com.demo.repositories.ProductRepository;

@Service
public class ProductServicesImpl implements ProductServices {
	@Autowired 
	private ProductRepository productRepository;

	@Override
	public Iterable<Product> findAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	

}
