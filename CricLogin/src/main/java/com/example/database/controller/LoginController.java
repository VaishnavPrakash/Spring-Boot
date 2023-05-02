package com.example.database.controller;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.model.LoginModel;
import com.example.database.service.LoginService;

@RestController
@RequestMapping("/cr")
public class LoginController 
{
	@Autowired
	private LoginService service;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> loginData) 
	{
	    String uname = loginData.get("uname");
	    String pwd = loginData.get("pwd");
	    String result = service.checkLogin(uname, pwd);
	    return result;
	}
	@PostMapping("/adduser")
	public LoginModel AddUser(@RequestBody LoginModel game) 
	{
		return service.addUser(game);
	}
	@GetMapping
	public List<LoginModel> listAll()
	{
		return service.getUser();
	}
}

