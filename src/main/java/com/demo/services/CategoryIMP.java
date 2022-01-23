package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Category;

import com.demo.repository.CategoryRepository;

@Service
public class CategoryIMP implements CategorySV {

	@Autowired
	private CategoryRepository categoryRepository;
	@Override
	public Iterable<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}
	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}
	@Override
	public Category find(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}
	@Override
	public void delete(int id) {
		categoryRepository.deleteById(id);
		
	}
	@Override
	public List<Category> findByName(String name) {
		// TODO Auto-generated method stub
		return categoryRepository.findByName(name);
	}
	

}
