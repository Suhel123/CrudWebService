package com.config.kgate;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.controller.kgate" })
public class WebConfig  extends WebMvcConfigurerAdapter{

	
	// dispacher servlet here in class type 
	
	/*
	 * Create a web @Configuration class annotated with @EnableWebMvc
	 * and @ComponentScan as follows.
	 */
}
