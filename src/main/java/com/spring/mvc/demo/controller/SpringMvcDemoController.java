package com.spring.mvc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.mvc.demo.model.User;
import com.spring.mvc.demo.service.UserService;

@Controller
public class SpringMvcDemoController {

	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@GetMapping("/hi")
	@ResponseBody
	public String sayHello() {

		return "Hi There";
	}

	@GetMapping("/user")
	@ResponseBody
	public User getUserDetails() {
		return userService.getUserDetails();
	}

}
