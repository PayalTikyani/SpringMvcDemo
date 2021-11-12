package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	//controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	//controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//controller method to process HTML form data and convert to uppercase
	@RequestMapping("/processFormToUpperCase")
	public String convertToUpperCase(HttpServletRequest request, Model model) {
		
		String result = "Name converted to Uppercase - " + request.getParameter("name").toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloWorld";
		
	}
	
	//controller method to process HTML form data and convert to uppercase
	@RequestMapping("/processFormToUpperCaseUsingRequestParam")
	public String convertToUpperCaseWithAnnotation(@RequestParam("name") String theName, Model model) {
		
		String result = "Name converted to Uppercase using @RequestParam - " + theName.toUpperCase();
		
		model.addAttribute("message", result);
		
		return "helloWorld";
		
	}
	
}
