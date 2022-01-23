package com.demo.controllers.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.repositories.ProductRepository;
import com.demo.services.ProductServices;

@Controller
@RequestMapping(value = {"", "product"})
public class ProductController  {
	@Autowired
	private ProductServices productServices;
	@RequestMapping(value = {"index"}, method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", productServices.findAll());
		return "product/index";
		
	}

}
