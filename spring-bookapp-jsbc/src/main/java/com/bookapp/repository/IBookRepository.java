package com.bookapp.repository;


import java.util.List;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;

public interface IBookRepository {
	void addBook(Book book);

	void updateBook(int bookId, double price);

	void deleteBook(int bookId);

	Book findById(int bookId) throws IdNotFoundException;

	List<Book> findAll();

	List<Book> findByAuthor(String author) throws BookNotFoundException;

	List<Book> findByCategory(String category) throws BookNotFoundException;

	List<Book> findByLesserPrice(double price) throws BookNotFoundException;

	List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException;
}
