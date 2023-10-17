package com.demo.thymeleaf.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class MyController {
	
	@RequestMapping(value = "/about" , method = RequestMethod.GET)

	public String about(Model model) {
		System.out.println("Welcome to FRK corporation");
	    model.addAttribute("name" , "Fardeen Khan");
	    
		return "about";
	}
	
	@GetMapping("/style")
	public String style() {
		
	    
		return "add-css-js-demo";
	}
	
	@GetMapping("/employees")
	public String emp() {
		
	    
		return "add-bootstrap";
	}

}
