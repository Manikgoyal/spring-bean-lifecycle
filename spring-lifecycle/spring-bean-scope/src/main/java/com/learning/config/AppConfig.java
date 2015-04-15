package com.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learning.service.springcore.Restaurant;


@Configuration
public class AppConfig {
	
	@Bean(name="restaurantBean1")
	@Scope("singleton")
	public Restaurant restaurantBean1(){
		return new Restaurant();
	}
	
	
	@Bean(name="restaurantBean2")
	@Scope("prototype")
	public Restaurant restaurantBean2(){
		return new Restaurant();
	}

}
