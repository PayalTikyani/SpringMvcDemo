package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AbcController {
	
	@RequestMapping("/showForm")
	public String abcShowForm() {
		return "abc";
	}

}
