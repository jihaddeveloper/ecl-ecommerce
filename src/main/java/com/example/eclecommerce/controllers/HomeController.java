package com.example.eclecommerce.controllers;

/*
 * Author: Jihad
 * Date: 16/08/2018
 * About:ECL E-commerce Home Controller
 * */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class); 
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String home() {
		logger.debug("Rendering Home Page !!");
		return "index";
	}

}
