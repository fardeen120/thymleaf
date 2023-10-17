package com.demo.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.demo.thymeleaf.entities.Employee;

@Controller
public class EmployeeController {
	
	@GetMapping("/iteration")
	public String iteration(Model model) {
		List <Employee> employee = new ArrayList<>();
		employee.add(new Employee("fardeen" , "Khan" , "iamfardeen96@gmail.com"));
		employee.add(new Employee("Rakshanda" , "Suryawanshi" , "iamraksharock@gmail.com"));
		employee.add(new Employee("Pranjal" , "Sahu" , "psahu@gmail.com"));
		employee.add(new Employee("Tabish" , "Abbasi" , "tabbascool@gmail.com"));
		employee.add(new Employee("Vedant" , "Sivnekar" , "gujju@gmail.com"));
		model.addAttribute("employee" , employee);
		return "iteration";
		
	}

}
