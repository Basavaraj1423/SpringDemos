package com.bookapp.util;

public class Queries {
	public static final String INSERTQUERY = "INSERT INTO Book(title,author,price,category) values(?,?,?,?)";
	public static final String UPDATEQUERY = "UPDATE Book SET price=? where bookId=?";
	public static final String DELETEQUERY = "DELETE FROM Book where bookId=?";

	public static final String SELECTQUERY = "SELECT * FROM Book";
	public static final String SELECTBYAUTHORQUERY = "SELECT * FROM Book where author=?";
	public static final String SELECTBYCATQUERY = "SELECT * FROM Book where category=?";
	public static final String SELECTBYPRICEQUERY = "SELECT * FROM Book where price<=?";
	public static final String SELECTBYAUTHCATQUERY = "SELECT * FROM Book where author=? and category=?";
	public static final String SELECTBYIDQUERY = "SELECT * FROM Book where bookId=?";
}
