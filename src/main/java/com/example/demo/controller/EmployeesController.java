package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employees;

@Controller
public class EmployeesController {
	
	@GetMapping("/")
	public String Schedule(Model model) {
		model.addAttribute("Employees", new Employees());
		return "schedule";
	}
	
	@PostMapping("/schedule")
	public String scheduleEmployee(@ModelAttribute Employees employees, Model model) {
		System.out.print(employees.toString());
		model.addAttribute("Employees", new Employees());
		model.addAttribute("message", "You have been clocked in");
		return "schedule"; 
	}
}
