package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/Tindex")
	public String Tindex() {
		return "index";
	}

	@RequestMapping("/jorgchart")
	public String jorgchart() {
		return "jorgchart";
	}
	@RequestMapping("/jorgchart_json")
	public String jorgchart_json() {
		return "jorgchart";
	}
}
