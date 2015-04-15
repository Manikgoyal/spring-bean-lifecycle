package com.learning.main.calling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.config.AppConfig;
import com.learning.service.springcore.Restaurant;

public class MainCalling {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Spring Singleton Bean Demo
		
		Restaurant restaurant1 = (Restaurant)context.getBean("restaurantBean1");
		restaurant1.setWelcomeNote("Welcome to learning series of Spring core with Singleton Demo");
		restaurant1.greetCustomer();
		
		Restaurant restaurant2 = (Restaurant)context.getBean("restaurantBean1");
		restaurant2.greetCustomer();
		
		
		
		//Spring Prototype Bean Demo
		
		
		Restaurant restaurant3 = (Restaurant)context.getBean("restaurantBean2");
		restaurant3.setWelcomeNote("Welcome to learning series of Spring core with Prototype Demo");
		restaurant3.greetCustomer();
		
		Restaurant restaurant4 = (Restaurant)context.getBean("restaurantBean2");
		restaurant4.greetCustomer();
		
		
	}

}
