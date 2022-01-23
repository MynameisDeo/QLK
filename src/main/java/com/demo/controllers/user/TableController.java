package com.demo.controllers.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = { "table" })
public class TableController {

	@RequestMapping(value = { "simple" }, method = RequestMethod.GET)
	public String simple(ModelMap map) {
		map.put("tableactive", "active");
		return "table/simple";
	}

	@RequestMapping(value = { "data" }, method = RequestMethod.GET)
	public String data(ModelMap map) {
		map.put("dataactive", "active");
		return "table/data";
	}

	@RequestMapping(value = { "jsgrid" }, method = RequestMethod.GET)
	public String jsgrid(ModelMap map) {
		map.put("jsgirdactive", "active");
		return "table/jsgrid";
	}

}
