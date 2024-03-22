package com.example.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration  //Spring will create the object for this class
public class AppConfig {
	
	//bean definitions
	@Bean
	public Chinese getChinese() {
		return new Chinese();
	}
	@Bean
	public Indian getIndian() {
		return new Indian();
	}
	@Bean
	@Primary
	public Italian getItalian() {
		return new Italian();
	}
	@Bean
	public Waiter getWaiter() {
		Waiter waiter = new Waiter();
		waiter.setGetItalian(getItalian());
		return waiter;
	}
}
