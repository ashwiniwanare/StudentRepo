package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
@GetMapping("/get")
public String m1()
{
	return "ashwini";
}


@GetMapping("/save")
public String save() {
	
	return "Data Saved";
}
}
