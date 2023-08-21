package com.example.day1.d1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class getpost {
	@Value("1")
	public int id;
	@Value("Sasi")
	public String name;
	@Value("19")
	public int age;
	@Value("80000")
	public long salary;
	@RequestMapping("/post")
	public String post() {
		return id+"-"+name+"-"+age+"-"+salary;
	}


}
