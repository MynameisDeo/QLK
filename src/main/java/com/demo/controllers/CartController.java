package com.demo.controllers;





import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.model.Account;
import com.demo.model.Customer;
import com.demo.model.ExportInvoice;

import com.demo.model.Item;

import com.demo.model.Product;
import com.demo.services.AccountSV;
import com.demo.services.CustomerSV;


import com.demo.services.ExportSV;
import com.demo.services.ProductSV;

@Controller
@RequestMapping( value = "cart")

public class CartController {
	
	@Autowired
	private ProductSV productSV;
	
	@Autowired
	private ExportSV exportSV;
	@Autowired
	private AccountSV accountSV;
	@Autowired
	private CustomerSV customerSV;
	
	
	
	
	
	
	
	
	@RequestMapping(value ="index" , method = RequestMethod.GET)
	public String index() {
		return "cart/index";
	}
	
	@RequestMapping(value ="buy/{id}" , method = RequestMethod.GET)
	public String buy(HttpSession session,@PathVariable("id") int id) {
		
		Product product = productSV.find(id);
		if(session.getAttribute("cart") == null) {
			
			List<Item> cart = new ArrayList<Item>();
			cart.add(new Item(product,1)) ;
			session.setAttribute("cart", cart);
		}else {
			List<Item> cart = (List<Item>) session.getAttribute("cart") ;
			int index = checkProduct(product, cart) ;
			if( index == -1) {
				cart.add(new Item(product,1)) ;				
			}
			else {
				cart.get(index).setQuantity(cart.get(index).getQuantity()+ 1 );
			}
			session.setAttribute("cart", cart);
		}
		return "redirect:/cart/index";
	}
	private int checkProduct(Product product, List<Item> cart) {
		for( int i=0 ; i< cart.size() ; i++) {
			if( cart.get(i).getProduct().getId().equals(product.getId()) ) {
				return i ;
			}
		}
		return -1 ; 
	}
	
	@RequestMapping(value ="delete/{id}" , method = RequestMethod.GET)
	public String delete(HttpSession session,@PathVariable("id") int id) {
		List<Item> cart = (List<Item>) session.getAttribute("cart") ;
		cart.remove(id);
		session.setAttribute("cart", cart);
		return "redirect:/cart/index";
	}
	
	
	
	@RequestMapping(value ="edit/{id}/{total}" , method = RequestMethod.GET)
	public String edit(HttpSession session,@PathVariable("id") int id , ModelMap modelMap,@PathVariable("total") 
	String total,@RequestParam("quantity") int quantity) {
		
		double total1 = Double.parseDouble(total);
		modelMap.put("id", id);
		modelMap.put("quantity", quantity);
		modelMap.put("total", total1);
		return "cart/edit";
		
		
	}
	@RequestMapping(value ="edit1" , method = RequestMethod.POST)
	public String edit1(@RequestParam("id_acc") int id_acc,@RequestParam("id_cus") int id_cus,@RequestParam("id_pro") int id_pro,
			@RequestParam("quantity") int quantity,@RequestParam("total") double total) {
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date now = new Date();	
		ExportInvoice exportInvoice = new ExportInvoice();
		
		Account account = accountSV.find(id_acc);
		Customer customer = customerSV.find(id_cus);
		Product product = productSV.find(id_pro);
		account.setId(id_acc);
		customer.setId(id_cus);
		product.setId(id_pro);
		exportInvoice.setProduct(product);
		exportInvoice.setAccount(account);
		exportInvoice.setCustomer(customer);
		exportInvoice.setQuantity(id_pro);
		exportInvoice.setPrice(total);
		exportInvoice.setName("name1");
		exportInvoice.setCreated(now);
		exportInvoice.setStatus(true);	
		exportSV.save(exportInvoice);
		
		
		
		return "redirect:/cart/index";
		
		
	}
	
	@RequestMapping(value ="edit2" , method = RequestMethod.POST)
	public String edit2(@RequestParam("id_acc") int id_acc,@RequestParam("id_cus") int id_cus,@RequestParam("id_pro") int id_pro) {
		//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date now = new Date();	
		ExportInvoice exportInvoice = new ExportInvoice();
		
		Account account = accountSV.find(id_acc);
		Customer customer = customerSV.find(id_cus);
		Product product = productSV.find(id_pro);
		account.setId(id_acc);
		customer.setId(id_cus);
		exportInvoice.setAccount(account);
		exportInvoice.setCustomer(customer);
		exportInvoice.setName("name1");
		exportInvoice.setCreated(now);
		exportInvoice.setStatus(true);	
		exportSV.save(exportInvoice);
		
		int haha = exportSV.limit(1);
		
		
		exportInvoice.setId(haha);
		
		return "redirect:/cart/index";
		
		
	}
	
	
	
	
	@RequestMapping(value ="update2/{id}" , method = RequestMethod.GET)
	public String update2(@ModelAttribute("product") Product product,HttpSession session,@PathVariable("id") int id,@RequestParam("quantity") int quantity) {
		List<Item> cart = (List<Item>) session.getAttribute("cart") ;
		product = productSV.find(id);
		product.setQuantity(productSV.quantity(id) - quantity);
		cart.remove(id);
		session.setAttribute("cart", cart);
		return "redirect:/cart/index";
	}
	
	@RequestMapping(value ="update" , method = RequestMethod.POST)
	public String update(HttpSession session,@RequestParam("quantity") String [] quantity) {
		List<Item> cart = (List<Item>) session.getAttribute("cart") ;
		for( int i = 0 ; i< cart.size() ; i++) {
			cart.get(i).setQuantity(Integer.parseInt( quantity[i].toString()) );
			System.out.println("cart" + quantity[i]);
			session.setAttribute("quantity",quantity[i]);
		}
		session.setAttribute("cart", cart);
		
		return "redirect:/cart/index";
	}

}
