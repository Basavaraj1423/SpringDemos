package com.voya.food;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Waiter {
	@Autowired
	IFoodMenu indian;
	@Autowired
	IFoodMenu chinese;
	@Autowired
	IFoodMenu italian;

	List<String> viewMenu(String choice) {
		if (choice.equals("In")) {
			return indian.showMenu();
		} else if (choice.equals("Ch")) {
			return chinese.showMenu();
		} else if (choice.equals("It")) {
			return italian.showMenu();
		}
		return null;
	}
}
