package com.example.day1.d1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Name {
	@GetMapping("name")
	public  String getName()
	{
		String s="sasi";
		return "welcome "+s+" !";
	}
	 
	

}
