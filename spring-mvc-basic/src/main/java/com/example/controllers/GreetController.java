package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {

	@RequestMapping("/greet")
	public String greetUser(Model model) {
		//call Service layer from here
		//add attributes and set to the next page
		model.addAttribute("message", "Great Day");
		return "success"; //this is the view name that is the jsp page
	}
	
	@RequestMapping("/hello")
	public String greetUser(ModelMap model) {
		//call Service layer from here
		//add attributes and set to the next page
		model.addAttribute("message", "Hello! Have a great Day");
		return "success"; //this is the view name that is the jsp page
	}
	@RequestMapping("/welcome")
	public ModelAndView greetUser() {
		//call Service layer from here
		//add attributes and set to the next page
		return new ModelAndView("success","message","Welcome to MVC");
	}
	
}
