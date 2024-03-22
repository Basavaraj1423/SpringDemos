package com.bookapp.repository;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bookapp.exceptions.BookNotFoundException;
import com.bookapp.exceptions.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;

@Repository
public class BookRepositoryImpl implements IBookRepository {
	private JdbcTemplate jdbcTemplate;

	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

//title,author,price,category
	@Override
	public void addBook(Book book) {
		Object[] bookArr = { book.getTitle(), book.getAuthor(), book.getPrice(), book.getCategory() };
		jdbcTemplate.update(Queries.INSERTQUERY, bookArr);
	}

	@Override
	public void updateBook(int bookId, double price) {
		jdbcTemplate.update(Queries.UPDATEQUERY, bookId, price);

	}

	@Override
	public void deleteBook(int bookId) {
		jdbcTemplate.update(Queries.DELETEQUERY, bookId);

	}

	@Override
	public Book findById(int bookId) throws IdNotFoundException {
		return jdbcTemplate.queryForObject(Queries.SELECTBYIDQUERY,new BookMapper(),bookId );
		
	}

	@Override
	public List<Book> findAll() {
		RowMapper<Book> mapper = new BookMapper();
		return jdbcTemplate.query(Queries.SELECTQUERY, mapper);
	}

	@Override
	public List<Book> findByAuthor(String author) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		return jdbcTemplate.query(Queries.SELECTBYAUTHORQUERY, mapper, author);

	}

	@Override
	public List<Book> findByCategory(String category) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		return jdbcTemplate.query(Queries.SELECTBYCATQUERY, mapper, category);
	}

	@Override
	public List<Book> findByLesserPrice(double price) throws BookNotFoundException {
		RowMapper<Book> mapper = new BookMapper();
		return jdbcTemplate.query(Queries.SELECTBYPRICEQUERY, mapper, price);
	}

	@Override
	public List<Book> findByAuthorCategory(String author, String category) throws BookNotFoundException {
		return jdbcTemplate.query(Queries.SELECTBYAUTHCATQUERY, new BookMapper(), author,category);
	}

}
