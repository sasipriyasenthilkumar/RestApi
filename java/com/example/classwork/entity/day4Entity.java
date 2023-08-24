package com.example.classwork.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class day4Entity {
	@Id
private int id;
	private String name;
	private String department;
	private String mail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
