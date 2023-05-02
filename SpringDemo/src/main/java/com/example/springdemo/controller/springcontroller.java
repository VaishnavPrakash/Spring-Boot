package com.example.springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.service.SpringService;

@RestController
public class springcontroller {
	@Autowired
	SpringService springService;
	
	@GetMapping("/tool")
	public String spring()
	{
		return "I am Spring Tool";
	}
	
	@GetMapping("/id/{usern}")
	public String ID(@PathVariable("usern")String usern)
	{
		return "id is "+usern;
	}
	
	@GetMapping("/bot")
	public String Bot(@RequestParam String user)
	{
		return "bot is "+user;
	}

}
