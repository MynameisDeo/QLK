package com.demo.controller.user;

import org.hibernate.engine.internal.Nullability.NullabilityCheckType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Account;
import com.demo.model.Role;
import com.demo.services.AccountSV;
import com.demo.services.RoleSV;

@Controller
@RequestMapping( value = { "", "account"})

public class AccountController {
	
	@Autowired
	private RoleSV roleSV;
	
	@Autowired
	private AccountSV accountSV;
	
	
	@RequestMapping( value = { "", "login"}, method = RequestMethod.GET)
	public String index(@RequestParam(value = "error", required = false) String error, @RequestParam
			(value = "logout", required = false) String logout , ModelMap modelMap) {
		if(error != null) {
			modelMap.put("msg", "Invalid");
		}
		if(logout != null) {
			modelMap.put("msg", "logout Successfully");
		}
		return "account/index";
	}
	
	@RequestMapping( value = "register", method = RequestMethod.GET)
	public String register(ModelMap modelMap) {
		modelMap.put("account", new Account());
		modelMap.put("roles", roleSV.findAll());
		
		return "account/register2";
	}
	@RequestMapping( value = "register", method = RequestMethod.POST)
	public String register(@ModelAttribute("account") Account account,
			@RequestParam("role") int[] roles,ModelMap model) {
		
		Account User = accountSV.findUser(account.getUsername());
		if(User == null) {
			//if(roles != null && roles.length > 0) {
			String hash = new BCryptPasswordEncoder().encode(account.getPassword());
			account.setPassword(hash);
			if(roles != null && roles.length > 0 ) {
				for(int role : roles) {
					account.getRoles().add(roleSV.find(role));
				}
			//}
			accountSV.save(account);
			return "redirect:/account/login";
			}
			else {
				model.put("role", "thieu role");
				model.put("roles", roleSV.findAll());
				return "account/register2";
			}
		}else {
			model.put("erro","ko cho tao");
			model.put("roles", roleSV.findAll());
			return "account/register2";
		}
		
		
		
	}
	
	@RequestMapping( value = "register3", method = RequestMethod.POST)
	public String register3(@ModelAttribute("account") Account account,
			@RequestParam("role") int[] roles,ModelMap model) {
		
		Account User = accountSV.findUser(account.getUsername());
		if(User == null) {
			//if(roles != null && roles.length > 0) {
			String hash = new BCryptPasswordEncoder().encode(account.getPassword());
			account.setPassword(hash);
			if(roles != null && roles.length > 0 && roles[0] == 2) {
				for(int role : roles) {
					account.getRoles().add(roleSV.find(role));
				}
			//}
			accountSV.save(account);
			return "redirect:/account/login";
			}
			else{
				model.put("roles", roleSV.findAll());
				model.put("role", "thieu role");
				
				return "account/register2";
			}
		}else {
			model.put("erro","ko cho tao");
			model.put("roles", roleSV.findAll());
			return "account/register2";
		}
		
		//return "account/register2";
		
		
	}
	
	@RequestMapping( value = "welcome", method = RequestMethod.GET)
	public String welcome(Authentication authentication) {
		System.out.println("welocme" + authentication.getName());
		return "account/welcome";
	}
	
	@RequestMapping( value = "accessDenied", method = RequestMethod.GET)
	public String accessDenied() {
		
		return "account/accessDenied";
	}
	
	
	
	
	
	

}
