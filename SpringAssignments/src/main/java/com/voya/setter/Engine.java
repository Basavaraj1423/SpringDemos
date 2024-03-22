package com.voya.setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	int capacity;
	String type;
	public int getCapacity() {
		return capacity;
	}
	@Value("${engine.capacity}")
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	@Value("${engine.type}")
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [capacity=" + capacity + ", type=" + type + "]";
	}
	
} 
