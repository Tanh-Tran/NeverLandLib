package com.NVLLib.Model.Book;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "LOCATION", uniqueConstraints={ @UniqueConstraint(columnNames = {"LCT_NO"}) })
public class Location {
	private String name;
	private String addrs;
	private Integer id;
	
	public Location(Integer id, String name, String addrs){
		this.id = id;
		this.name = name;
		this.addrs = name;
	}
	
	public Location(String name, String addrs){
		this(null,name,addrs);
	}
	
	@Id
	@Column(name = "LCT_ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "LCT_NAME", length = 50, nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "LCT_ADDR", length = 50, nullable = false)
	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	
	
	
}
