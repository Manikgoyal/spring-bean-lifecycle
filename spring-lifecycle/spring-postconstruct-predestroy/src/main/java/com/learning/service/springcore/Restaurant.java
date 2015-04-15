package com.learning.service.springcore;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class Restaurant implements InitializingBean,DisposableBean{
	
	private String welcomeNote;
	
	
	public void init(){
		System.out.println("Welcome to init method of resturant bean");
	}
	
	public void destroy1(){
		System.out.println("Welcome to destroy method of resturant bean");
	}
	
	@PostConstruct
	public void init1(){
		System.out.println("Welcome to init1 method of resturant bean");
	}
	@PreDestroy
	public void destroy2(){
		System.out.println("Welcome to destroy1 method of resturant bean");
	}
	
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}



	public void greetCustomer(){
		System.out.println(welcomeNote);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Welcome to after propertyset method of resturant bean");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Welcome to Disposable method of resturant bean");
		
	}
	

}
