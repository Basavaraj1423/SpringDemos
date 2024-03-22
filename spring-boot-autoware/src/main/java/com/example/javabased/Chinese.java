package com.example.javabased;

import java.util.Arrays;

import java.util.List;




public class Chinese implements IFoodMenu {

	@Override
	public List<String> showMenu() {
		return Arrays.asList("Noodles","Fried Rice","Gobi Manchurian","Suchi");
	}

}
