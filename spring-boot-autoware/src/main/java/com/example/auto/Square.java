package com.example.auto;

import org.springframework.stereotype.Component;

@Component("shaper")
public class Square implements IShape {

	@Override
	public void area(int x, int y) {
		System.out.println("The area in square " + (x * y));

	}

}
