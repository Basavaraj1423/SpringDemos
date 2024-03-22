package com.example.javabased;

import java.util.Arrays;

import java.util.List;


public class Italian implements IFoodMenu {

	@Override
	public List<String> showMenu() {

		return Arrays.asList("Pizza", "Truffles", "Pasta", "Mocktail");
	}

}
