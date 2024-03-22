package com.bookapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringBookappJsbcApplication implements CommandLineRunner {
	@Autowired
	private IBookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJsbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//String title, String author, String category, double price
//		Book book = new Book("IDGAF","Suman","Fiction",6000);
//		bookService.addBook(book);
//		
//		List<Book> books = bookService.getAll();
//		for(Book book1 : books) {
//			System.out.println(book1);
//		}
//	System.out.println(bookService.getByCategory("Tech"));
	
//	System.out.println(bookService.getByAuthorStartsWith("Surya"));
	
	System.out.println(bookService.getById(1));
		

	}

}
