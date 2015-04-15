package com.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learning.service.springcore.DemoBeanFactoryPostProcessor;
import com.learning.service.springcore.Restaurant;


@Configuration
public class AppConfig {
	
	@Bean(name="restaurantBean1")
	@Scope("singleton")
	public Restaurant restaurantBean1(){
		Restaurant restaurant = new Restaurant();
		restaurant.setWelcomeNote("Welcome to learning series of Spring core with Singleton Demo");
		return restaurant;
	}
	
	
	@Bean(name="restaurantBean2")
	@Scope("prototype")
	public Restaurant restaurantBean2(){
		return new Restaurant();
	}
	
	@Bean
	public DemoBeanFactoryPostProcessor beanFactoryPostProcessor(){
		return new DemoBeanFactoryPostProcessor();
	}

}
