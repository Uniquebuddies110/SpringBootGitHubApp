package com.ajay.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		int a=10;
		int b=20;
		System.out.println("Welcome to Modified Spring Boot Github App");
	}

}
