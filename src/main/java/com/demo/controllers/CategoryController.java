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

@Controller
@RequestMapping( value = "category")

public class CategoryController {
	
	@Autowired
	private CategorySV categorySV;
	
	
	@RequestMapping( value = { "", "index"}, method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("categories", categorySV.findAll());
		return "category/index";
	}
	
	@RequestMapping( value = "addcategory", method = RequestMethod.GET)
	public String addcategory(ModelMap modelMap) {
		modelMap.put("category", new Category());
		return "category/addcate";
	}
	@RequestMapping( value = "addcategory", method = RequestMethod.POST)
	public String register(@ModelAttribute("category") Category category) {
		categorySV.save(category);
		return "redirect:/category/index";
	}
	
	@RequestMapping(value ="delete/{id}" , method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id) {
		 categorySV.delete(id);
		return "redirect:/category/index";
	}
	
	@RequestMapping(value ="edit/{id}" , method = RequestMethod.GET)
	public String edit(@PathVariable("id") int id , ModelMap modelMap) {
		modelMap.put("category", categorySV.find(id));
		return "category/edit";
	}
	
	@RequestMapping(value ="edit" , method = RequestMethod.POST)
	public String edit(@ModelAttribute("category") Category category) {
		
		categorySV.save(category);
		return "redirect:/category/index";
	}
	
	@RequestMapping(value =  "search", method = RequestMethod.POST)
	public String search(ModelMap modelMap, @RequestParam("name") String name) {
		modelMap.put("categories", categorySV.findByName(name));
		return "category/index";
	}
	
	
	
	
	
	

}
