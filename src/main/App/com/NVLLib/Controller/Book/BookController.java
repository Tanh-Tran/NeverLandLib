package com.NVLLib.Controller.Book;

import java.util.ArrayList;

import com.NVLLib.Model.Book.Book;

public class BookController implements BookDAO{
	private ArrayList<Book> booklist;
	
	public BookController(){
		booklist = new ArrayList<Book>();
	}

	
	public void addBook(Book b){
		
		booklist.add(b);
		
	}

	
	public void deleteBook(Book b) {
		
		booklist.remove(b);	
		
	}


	@Override
	public ArrayList<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<Book> findbyID() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ArrayList<Book> findByName() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		
	}
}
