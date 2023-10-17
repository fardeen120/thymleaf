package com.demo.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.demo.thymeleaf.entities.User;

@Controller
public class UserController {
	
	@GetMapping("if-unless")
	public String IfUnless(Model model) {
		List <User> user = new ArrayList<>();
		user.add(new User("fardeen Khan" , "iamfardeen96@gmail.com" , "ADMIN", "M"));
		user.add(new User("Rakshanda Suryawanshi" , "iamraksharock@gmail.com","USER", "F"));
		user.add(new User("Pranjal Sahu" , "psahu@gmail.com", "USER", "F"));
		user.add(new User("Tabish Abbasi" , "tabbascool@gmail.com", "USER", "M"));
		
		model.addAttribute("user" , user);
		return "if-unless";
		
		
		
	}
	
	@GetMapping("switch-case")
    public String user(Model model){
        User user = new User("fardeen Khan" , "iamfardeen96@gmail.com" , "ADMIN", "M");
        model.addAttribute("user", user);
        return "switch-case";
    }

}
