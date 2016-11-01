package com.NVLLib.Model.Book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "CATEGORY", uniqueConstraints={ @UniqueConstraint(columnNames = {"CAT_NO"}) })
public class Categories {
	public String id;
	private String name;
	
	public Categories(String id,String name){
		
		this.name = name;
	}
	public Categories(String name){
		this(null, name);
	}
	
	@Id
	@Column(name = "CAT_ID")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "CAT_NAME", length = 50, nullable = false)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
