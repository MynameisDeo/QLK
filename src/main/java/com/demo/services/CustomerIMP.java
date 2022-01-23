package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.model.Category;
import com.demo.model.Customer;
import com.demo.model.ExportInvoice;
import com.demo.model.Product;
import com.demo.repository.CategoryRepository;
import com.demo.repository.CusRepository;
import com.demo.repository.ExportRepository;
import com.demo.repository.ProductRepository;

@Service
public class CustomerIMP implements CustomerSV {

	
	@Autowired
	private CusRepository cusRepository;

	@Override
	public Customer find(int id) {
		// TODO Auto-generated method stub
		return cusRepository.findById(id).get();
	}

	

	
	
	

}
