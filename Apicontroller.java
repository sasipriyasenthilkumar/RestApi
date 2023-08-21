package com.example.day1.d1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apicontroller {
	@GetMapping("wel")
	public String Welcome()
	{
		return "welcome";
	}

}
