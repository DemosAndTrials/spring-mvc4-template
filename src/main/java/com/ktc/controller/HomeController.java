package com.ktc.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "Hello";
	}
	
	/**
	 * Home page
	 */
	@RequestMapping("/")
	public String index(Model model) {

		//System.out.println("HomeController");
		int year = Calendar.getInstance().get(Calendar.YEAR);
		model.addAttribute("year", year);
		return "Index";
	}
}
