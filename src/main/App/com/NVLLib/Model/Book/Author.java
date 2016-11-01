package com.NVLLib.Model.Book;

public class Author {
	
	private String id;
	private String name;
	private String Bio;
	
	public Author(String id, String name, String Bio){
		this.id = id;
		this.name = name;
		this.Bio = Bio;
	}
	public Author(String name, String Bio){
		this(null, name, Bio);
	}
	
}
