package com.example.classwork.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.classwork.entity.day4Entity;
import com.example.classwork.repository.day4Interface;

@Service
public class day4Service {
	@Autowired
	day4Interface student;
	public day4Entity update(day4Entity d4)
	{
		return student.save(d4);
	}
	public void delete(int id)
	{
		student.deleteById(id);
	}
	public void deleteInfo(day4Entity d4)
	{
		student.delete(d4);
	}
	public day4Entity create(day4Entity e) {
		// TODO Auto-generated method stub
		return student.save(e);
	}

}
