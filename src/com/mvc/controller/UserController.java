package com.mvc.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.model.User;
import com.mvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String Login(User user,HttpServletRequest request){
		User loginUser=userService.getUser(user);
		if(loginUser==null){
			return "fail";
		}
		request.setAttribute("Msg","用户为："+loginUser.getUserName());
		return "success";
	}
	@RequestMapping("/save")
	public String save(User user,HttpServletRequest request){
		userService.save(user);
		request.setAttribute("Msg", "保存成功！");
		return "success";
	}
	@RequestMapping("/delete")
	public String delete(User user,HttpServletRequest request){
		userService.delete(user);
		request.setAttribute("Msg","删除成功！");
		return "success";
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
