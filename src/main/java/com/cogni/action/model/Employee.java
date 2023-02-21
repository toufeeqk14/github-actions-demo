package com.cogni.action.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

	private @Id @GeneratedValue Long id;
	private String name;
	private String role;

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

	public String getRole() {
		return role;
	}

	public Employee(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setRole(String role) {
		this.role = role;
	}

}
