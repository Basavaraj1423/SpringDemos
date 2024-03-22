package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication implements CommandLineRunner {
	@Autowired
	IProductService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// product_id,product_name,brand,price,category

//		Product product = new Product(4,"Air cooler","Loydes",12000,"Home Appliances");
//		service.addProduct(product);

		// service.updateProduct(1, 45000);

		// service.deleteProduct(4);

		// System.out.println(service.getAll());

		// System.out.println(service.getByBrand("panasonic"));

		// System.out.println(service.getByLessPrice(30000));

		System.out.println(service.getByCategoryAndPrice("Home Appliances", 30000));

	}

}
