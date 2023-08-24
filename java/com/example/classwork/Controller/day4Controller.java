package com.example.classwork.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.classwork.entity.day4Entity;
import com.example.classwork.service.day4Service;

@RestController
public class day4Controller {
	@Autowired
	day4Service day4Service ;
	
	@PostMapping("post")
	public day4Entity post(@RequestBody day4Entity e)
	{
		return day4Service.create(e);
	}
	@PutMapping("put")
	public day4Entity upd(@RequestBody day4Entity e)
	{
	return day4Service.update(e);
	}
	@DeleteMapping("delete/{id}")
	public String del(@PathVariable int id)
	{
		day4Service.delete(id);
		return "deleted";
	}
	
	

}
