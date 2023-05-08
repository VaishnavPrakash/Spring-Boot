package com.example.connectivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.connectivity.model.AdminModel;
import com.example.connectivity.model.LoanApplicationModel;
import com.example.connectivity.model.LoginModel;
import com.example.connectivity.model.UserModel;
import com.example.connectivity.service.LoanService;

@RestController
@CrossOrigin
public class LoanController {
	@Autowired
    public LoanService lser;
	  
	//AdminModel
	@PostMapping("/postAdmin")
	public AdminModel postD(@RequestBody AdminModel amodel)
	{
		return lser.postAdmin(amodel);
	}
	@GetMapping("/getAdmin")
	public List<AdminModel> getD()
	{
		return lser.getAdmin();
	}
	@PutMapping("/UpdateAdmin")
	public AdminModel putD(@RequestBody AdminModel amodel1)
	{
		return lser.putAdmin(amodel1);
	}
	@DeleteMapping("/deleteAdmin/{cpas}")
	public String deleteD(@PathVariable("cpas") String password)
	{
		lser.deleteAdmin(password);
		return "Deleted";
	}
	
	//LoanApplicationModel
	
	@PostMapping("/postApp")
	public LoanApplicationModel postD1(@RequestBody LoanApplicationModel amodel3)
	{
		return lser.postApplication(amodel3);
	}
	@GetMapping("/getApp")
	public List<LoanApplicationModel> getD1()
	{
		return lser.getApplication();
	}
	@PutMapping("/updateApp")
	public LoanApplicationModel putD1(@RequestBody LoanApplicationModel amodel4)
	{
		return lser.putApplication(amodel4);
	}
	@DeleteMapping("/deleteApp/{cid}")
	public String deleteD1(@PathVariable("cid") int loanid)
	{
		lser.deleteApplication(loanid);
		return "Deleted";
	}
	
	//LoginModel
	@PostMapping("/postLogin")
	public LoginModel postD2(@RequestBody LoginModel amodel5)
	{
		return lser.postLogin(amodel5);
	}
	@GetMapping("/getLogin")
	public List<LoginModel> getD2()
	{
		return lser.getLogin();
	}
	@PutMapping("/updateLogin")
	public LoginModel putD2(@RequestBody LoginModel amodel6)
	{
		return lser.putLogin(amodel6);
	}
	@DeleteMapping("/deleteLogin/{id}")
	public String deleteD2(@PathVariable ("id")int id)
	{
		lser.deleteLogin(id);
		return "Deleted Successfully";
	}
	
	//UserModel
	@PostMapping("/postUser")
	public UserModel postD3(@RequestBody UserModel amodel7)
	{
		return lser.postUser(amodel7);
	}
	@GetMapping("/getUser")
	public List<UserModel> getD3()
	{
		return lser.getUser();
	}
	@PutMapping("/updateUser")
	public UserModel putD3(@RequestBody UserModel amodel8)
	{
		return lser.putUser(amodel8);
	}
	@DeleteMapping("/deleteUser/{aid}")
	public String deleteD3(@PathVariable("aid") int id)
	{
		lser.deleteUser(id);
		return "Deleted";
	}
}
