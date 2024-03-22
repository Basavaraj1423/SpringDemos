package com.example.controllers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetController {
	// http://localhost:8081/greet
	@GetMapping("/greet")
	public String showMessage() {
		return "Hey Hi Bro Have a Great Day";
	}

	@GetMapping("/user/books/show")
	public List<String> showBooks() {
		return Arrays.asList("Java", "Spring");
	}

	@GetMapping("/admin/books/in")
	public String addBooks() {
		return "Added Successfully";
	}

}
