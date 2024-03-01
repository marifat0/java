package com.rest.api.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@RequestMapping("/api")
@Controller
public class GreetingController {

	@GetMapping("/halo")
	public String greeting() {
		System.out.println("HOHO");
		return "";
	}

	@GetMapping("/greeting")
	public ModelAndView index() {
		return new ModelAndView("HOHO");
	}
	
}