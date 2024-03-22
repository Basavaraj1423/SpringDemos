package com.voya.food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.food");
		Waiter waiter = context.getBean(Waiter.class);
		System.out.println(waiter.viewMenu("It"));
	}

}
