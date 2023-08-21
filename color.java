package com.example.day1.d1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class color {
	@GetMapping("/col")
	public String getMyFav()
	{
		String s="beige";
		return "My favorite color is "+s;
	}

}
