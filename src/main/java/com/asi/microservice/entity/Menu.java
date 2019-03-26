package com.asi.microservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	@Id
	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Menu(){
	}
	@Override
	public String toString() {
		return String.format("Menu[id=%d, name='%s']", id, name);
	}
}