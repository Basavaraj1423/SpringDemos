package com.voya.food;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Chinese implements IFoodMenu {

	@Override
	public List<String> showMenu() {
		return Arrays.asList("Noodles","Fried Rice","Gobi Manchurian","Suchi");
	}

}
