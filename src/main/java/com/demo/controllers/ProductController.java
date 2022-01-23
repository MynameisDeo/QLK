package com.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Account;
import com.demo.model.Category;
import com.demo.services.CategorySV;
import com.demo.services.ProductSV;

@Controller
@RequestMapping( value = "product")

public class ProductController {
	
	@Autowired
	private CategorySV categorySV;
	
	@Autowired
	private ProductSV productSV;
	
	
	@RequestMapping( value = { "", "index"}, method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", productSV.findAll());
		return "product/index";
	}
	
	
	
	
	
	
	
	

}
