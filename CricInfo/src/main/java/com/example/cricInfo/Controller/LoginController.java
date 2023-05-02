package com.example.cricInfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricInfo.Model.LoginModel;
import com.example.cricInfo.Service.LoginService;

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
	public LoginModel AddUser(@RequestBody LoginModel l) 
	{
		return service.addUser(l);
	}
	@GetMapping
	public List<LoginModel> listAll()
	{
		return service.getUser();
	}
}

