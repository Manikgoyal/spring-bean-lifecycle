package com.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learning.service.springcore.DemoBeanPostProcessor;
import com.learning.service.springcore.DemoBeanPostProcessor2;
import com.learning.service.springcore.Restaurant;


@Configuration
public class AppConfig {
	
	@Bean(name="restaurantBean1",initMethod="init",destroyMethod="destroy")
	@Scope("singleton")
	public Restaurant restaurantBean1(){
		return new Restaurant();
	}
	
	
	@Bean(name="restaurantBean2")
	@Scope("prototype")
	public Restaurant restaurantBean2(){
		return new Restaurant();
	}
	
	@Bean
	public DemoBeanPostProcessor beanPostProcessor(){
		return new DemoBeanPostProcessor();
	}
	
	@Bean
	public DemoBeanPostProcessor2 beanPostProcessor2(){
		return new DemoBeanPostProcessor2();
	}

}
