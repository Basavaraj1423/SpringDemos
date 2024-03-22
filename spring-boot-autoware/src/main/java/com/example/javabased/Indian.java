package com.example.javabased;

import java.util.Arrays;

import java.util.List;


public class Indian implements IFoodMenu {

	@Override
	public List<String> showMenu() {
		return Arrays.asList("Masala Dosa","Roti curry","Rice dhal","Dhal Kichidi");
		
	}

}
