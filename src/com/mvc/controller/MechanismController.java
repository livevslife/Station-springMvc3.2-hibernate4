package com.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.model.Mechanism;
import com.mvc.service.MechanismService;

@Controller
@RequestMapping("Mechanism")
public class MechanismController {
	private MechanismService mechanismService;
	@RequestMapping(value = "/index")
	public String index() {
		return "mechanism/index";
	}
	@RequestMapping(value = "/save")
	public String save(Mechanism mechanism,HttpServletRequest request) {
		mechanism.setActive(0);
		mechanismService.save(mechanism);
		request.setAttribute("Msg", "Ìí¼Ó³É¹¦");
		return "mechanism/index";
	}
}
