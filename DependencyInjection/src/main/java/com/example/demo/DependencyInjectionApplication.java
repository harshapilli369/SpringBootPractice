package com.example.demo;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.beans.WishMessageGenerator;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		WishMessageGenerator generator = ctx.getBean("wishMessageGenerator", WishMessageGenerator.class);
		String result = generator.generateWishMessage("John");
		System.out.println(result);
	}
	
	@Bean
	public Calendar calendar() {
		return Calendar.getInstance();
	}

}
