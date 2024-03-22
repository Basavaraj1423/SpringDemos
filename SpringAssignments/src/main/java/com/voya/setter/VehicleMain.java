package com.voya.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.setter");
		Vehicle vehicle = context.getBean(Vehicle.class);
		System.out.println(vehicle);
	}
}
