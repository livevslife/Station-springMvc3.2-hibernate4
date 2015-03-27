package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UimakerController {
	@RequestMapping(value = "/main")
	public String main() {
		return "main";
	}

	@RequestMapping(value = "/top")
	public String top() {
		return "top";
	}

	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/Default")
	public String Default() {
		return "default";
	}

	@RequestMapping(value = "/left")
	public String left() {
		return "left";
	}

	@RequestMapping(value = "/form")
	public String form() {
		return "form";
	}

	@RequestMapping(value = "/imglist")
	public String imglist() {
		return "imglist";
	}

	@RequestMapping(value = "/imgtable")
	public String imgtable() {
		return "imgtable";
	}

	@RequestMapping(value = "/imglist1")
	public String imglist1() {
		return "imglist1";
	}

	@RequestMapping(value = "/tools")
	public String tools() {
		return "tools";
	}

	@RequestMapping(value = "/filelist")
	public String filelist() {
		return "filelist";
	}

	@RequestMapping(value = "/tab")
	public String tab() {
		return "tab";
	}

	@RequestMapping(value = "/error")
	public String error() {
		return "error";
	}

	@RequestMapping(value = "/right")
	public String right() {
		return "right";
	}

	@RequestMapping(value = "/computer")
	public String computer() {
		return "computer";
	}
}
