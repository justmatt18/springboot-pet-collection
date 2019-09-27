package com.mat.app.rest_mongodb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController
{
	 @GetMapping({"/", "/hello"})
	 public String showWelcomePage()
	 {
		 return "hello";
	 }
}
