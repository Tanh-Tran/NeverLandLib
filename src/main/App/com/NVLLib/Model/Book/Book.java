package com.NVLLib.Model.Book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "BOOK", uniqueConstraints={ @UniqueConstraint(columnNames = {"BOOK_NO"}) })	
public abstract class Book {
	private String name;
	private String location;
	private String id;
	private int type;
	private IdGenerator idgen;
	
	
	public Book(String name, String location,int type){
		
		this.name = name;
		this.location = location;
		this.type = type;
	}
	
	@Id
	@Column(name = "BOOK_ID")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "BOOK_NAME",length = 50, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "BOOK_LOCATION",length = 50, nullable = false)
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
		
	public String toString(){
		return getId()+"   "+"   "+getName();
	}
	
}
