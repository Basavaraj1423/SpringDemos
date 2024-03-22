package com.example.javabased;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Waiter {
	@Autowired
	@Qualifier("getIndian")
	IFoodMenu iFoodMenu;
	
	
	@Autowired
	IFoodMenu menus;
	
	
	
	IFoodMenu menuItems;
	public void setGetItalian(IFoodMenu getItalian) {
		this.menuItems = getItalian;
	}


	public List<String> viewMenu(String choice) {
		List<String> menuList = new ArrayList<>();
		if (choice.equals("In")) {
			menuList = iFoodMenu.showMenu();
		} else if (choice.equals("Ch")) {
			menuList =  menus.showMenu();
		} else if (choice.equals("it")) {
			menuList =  menuItems.showMenu();
		}
		return menuList;
	}
}
