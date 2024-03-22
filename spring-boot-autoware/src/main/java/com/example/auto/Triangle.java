package com.example.auto;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	@Override
	public void area(int x, int y) {
		System.out.println("The area in triangle " + (x * y));

	}

}
