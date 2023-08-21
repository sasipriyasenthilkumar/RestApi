package com.example.day1.d1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jason {
	@Value("${var}")
	private String name;
	@GetMapping("sasi")
	public String display()
	{
		return "hi"+"this"+"is"+name;
	}

}
