package com.example.eclecommerce;

/*
 * Author: Jihad
 * Date: 27/08/2018
 * About:ECL E-commerce ServletInitializer Class
 * */

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder) {
		return springApplicationBuilder.sources(EclEcommerceApplication.class);
	}

}
