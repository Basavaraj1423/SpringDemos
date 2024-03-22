package com.productapp.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.Product;

@RestController
public class ProductController {

	@GetMapping()
	void addProduct(Product product) {

	}

	void updateProduct(int productId, double price) {

	}

	void deleteProduct(int productId) {

	}

	Product getByID(int productId) {
		return null;

	}

	List<Product> getAll() {
		return null;

	}

	List<Product> getByBrand(String brand) {
		return null;

	}

	List<Product> getByLessPrice(double price) {
		return null;

	}

	List<Product> getByCategoryAndPrice(String category, double price) {
		return null;

	}

}
