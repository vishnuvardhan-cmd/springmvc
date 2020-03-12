package com.spring.mvc.servlet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({ "com.spring.mvc.servlet" })
public class AppConfig {
	@Bean
	public InternalResourceViewResolver view()
	{
		InternalResourceViewResolver rv=new InternalResourceViewResolver();
		rv.setPrefix("/WEB-INF/");
		rv.setSuffix(".jsp");
		return rv;
	}
}
