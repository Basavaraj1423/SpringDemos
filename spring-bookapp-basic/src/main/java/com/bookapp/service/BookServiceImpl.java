package com.bookapp.service;

import com.bookapp.exceptions.BookNotFoundException;

import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
	private BookDetails details;

	public BookDetails getDetails() {
		return details;
	}

	@Autowired
	public void setDetails(BookDetails details) {
		this.details = details;
	}

	@Override
	public List<Book> getAll() throws BookNotFoundException {
		List<Book> books = details.showDetails();
		return books;
	}

	@Override
	public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
		List<Book> books = details.showDetails();
		List<Book> authorStartsWith = new ArrayList<>();
		for (Book book : books) {
			if (book.getAuthor().startsWith(author)) {
				authorStartsWith.add(book);
			}
		}
		if (authorStartsWith.isEmpty()) {
			throw new BookNotFoundException("Unable to Find the book author starts with");
		}
		return authorStartsWith;
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		List<Book> books = details.showDetails();
		List<Book> newCategory = new ArrayList<>();
		for (Book categories : books) {
			if (categories.getCategory().equals(category)) {
				newCategory.add(categories);
			}
		}
		if (newCategory.isEmpty()) {
			throw new BookNotFoundException("Unable to Find the book getcategory");
		}
		return newCategory;
	}

	@Override
	public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
		List<Book> books = details.showDetails();
		List<Book> newPrices = new ArrayList<>();
		for (Book prices : books) {
			if (price < prices.getPrice()) {
				newPrices.add(prices);
			}
		}
		if (newPrices.isEmpty()) {
			throw new BookNotFoundException("Unable to Find the book newPrices");
		}

		return newPrices;
	}

	@Override
	public List<Book> getByAuthorContainsAndCategory(String author, String category) throws BookNotFoundException {
		List<Book> books = details.showDetails();
		List<Book> autCatBy = new ArrayList<>();
		for (Book aut : books) {
			if (aut.getAuthor().equals(author) && aut.getCategory().equals(category)) {
				autCatBy.add(aut);
			}
		}
		if (autCatBy.isEmpty()) {
			throw new BookNotFoundException("Unable to Find the book AuthorContainsAndCategory");
		}
		return autCatBy;
	}

	@Override
	public Book getById(int bookId) throws IdNotFoundException {
		List<Book> books = details.showDetails();
		for (Book newBook : books) {
			if (newBook.getBookId() == bookId) {
				return newBook;
			}
		}
		throw new IdNotFoundException("Ivalid ID");
	}
}
