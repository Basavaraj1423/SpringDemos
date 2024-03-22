package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	IProductRepository repository;

	@Override
	public void addProduct(Product product) {
		repository.addProduct(product);
	}

	@Override
	public void updateProduct(int productId, double price) {
		repository.updateProduct(productId, price);

	}

	@Override
	public void deleteProduct(int doctorId) {
		repository.deleteProduct(doctorId);

	}

	@Override
	public Product getByID(int productId) throws ProductNotFoundException {
		Product product = repository.findByID(productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		List<Product> products = repository.findAll();
		return products;
	}

	@Override
	public List<Product> getByBrand(String brand) throws ProductNotFoundException {
		List<Product> products = repository.findByBrand(brand);
		return products;
	}

	@Override
	public List<Product> getByLessPrice(double price) throws ProductNotFoundException {
		List<Product> products = repository.findByLessPrice(price);
		return products;
	}

	@Override
	public List<Product> getByCategoryAndPrice(String category, double price) throws ProductNotFoundException {
		List<Product> products = repository.findByCategoryAndPrice(category, price);
		return products;
	}

}
