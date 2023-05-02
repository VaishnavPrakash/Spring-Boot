package com.example.cricInfo.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cricInfo.Model.LoginModel;
import com.example.cricInfo.Repo.LoginRepo;

@Service
public class LoginService 
{
	@Autowired
	private LoginRepo repository;
	
	public String checkLogin(String uname, String pwd) 
	{
	    LoginModel user = repository.findByuname(uname);
	    if (user == null)
	    {
	      return "User Not Found";
	    }
	    else
	    {
	    	if(user.getPwd().equals(pwd)) 
	    	{	    		
	    		return"Login Succesfull"; 
	    	}
	    	else {
	    		return "Login Failed";
	    	}
	    }
	}
	public LoginModel addUser(LoginModel game) 
	{
		return repository.save(game);
	}
	public List<LoginModel> getUser()
	{
		return repository.findAll();
	}
	
}
