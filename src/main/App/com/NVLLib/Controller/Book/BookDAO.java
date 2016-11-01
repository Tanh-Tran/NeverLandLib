package com.NVLLib.Controller.Book;

import java.util.ArrayList;

import com.NVLLib.Model.Book.Book;

public interface BookDAO {
	ArrayList<Book> findAll();
	ArrayList<Book> findbyID();
	ArrayList<Book> findByName();
	
	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(Book book);
}
