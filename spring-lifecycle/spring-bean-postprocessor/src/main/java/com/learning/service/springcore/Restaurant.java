package com.learning.service.springcore;



import org.springframework.stereotype.Service;

@Service
public class Restaurant{
	
	private String welcomeNote;
	
	
	public void init(){
		System.out.println("Welcome to init method of resturant bean");
	}
	
	public void destroy(){
		System.out.println("Welcome to destroy method of resturant bean");
	}
	
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}



	public void greetCustomer(){
		System.out.println(welcomeNote);
	}

	

}
