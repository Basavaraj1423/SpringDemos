package com.bookapp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	IBookRepository repository;

	@Override
	public void addBook(Book book) {
		repository.addBook(book);
		
	}

	@Override
	public void updateBook(int bookId, double price) {
		repository.updateBook(bookId, price);
		
	}

	@Override
	public void deleteBook(int bookId) {
		repository.deleteBook(bookId);
		
	}

	@Override
	public List<Book> getAll() {
		return repository.findAll();
		
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		repository.findByAuthor(author);
		if(repository.findByAuthor(author).isEmpty()) {
			throw new BookNotFoundException("The author is not available");
		}
		return repository.findByAuthor(author);
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		repository.findByCategory(category);
		if(repository.findByCategory(category).isEmpty()) {
			throw new BookNotFoundException("The category is not available");
		}
		return repository.findByCategory(category);
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		repository.findByLesserPrice(price);
		if(repository.findByLesserPrice(price).isEmpty()) {
			throw new BookNotFoundException("The given Price is not available");
		}
		return repository.findByLesserPrice(price);
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		repository.findByAuthorCategory(author, category);
		if(repository.findByAuthorCategory(author, category).isEmpty()) {
			throw new BookNotFoundException("The author and category not available");
		}
		return repository.findByAuthorCategory(author, category);
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		repository.findById(bookId);
		if(repository.findById(bookId)==null) {
			throw new BookNotFoundException("The book Id is not available");
		}
		return repository.findById(bookId);
	}

}
