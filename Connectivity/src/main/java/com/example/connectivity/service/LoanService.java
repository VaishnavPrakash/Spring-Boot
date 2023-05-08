package com.example.connectivity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.connectivity.model.AdminModel;
import com.example.connectivity.model.LoanApplicationModel;
import com.example.connectivity.model.LoginModel;
import com.example.connectivity.model.UserModel;
import com.example.connectivity.repo.AdminRepo;
import com.example.connectivity.repo.LoanApplicationRepo;
import com.example.connectivity.repo.LoginRepo;
import com.example.connectivity.repo.UserRepo;

@Service
public class LoanService {
	@Autowired
    public AdminRepo arepo;
    public LoanApplicationRepo loanrepo;
    @Autowired	
    public LoginRepo lrepo;
    public UserRepo urepo;
     
    //AdminModel
     public AdminModel postAdmin(AdminModel amodel)
     {
    	 return arepo.save(amodel);
     }
     
     public List<AdminModel> getAdmin()
     {
    	 return arepo.findAll();
     }
     
     public AdminModel putAdmin(AdminModel amodel1)
     {
    	 return arepo.saveAndFlush(amodel1);
     }
     
     public void deleteAdmin(String password)
     {
    	 arepo.deleteById(password);
     }
     
     //LoanApplicationModel
     public LoanApplicationModel postApplication(LoanApplicationModel amodel2)
     {
    	 return loanrepo.save(amodel2);
     }
     
     public List<LoanApplicationModel> getApplication()
     {
    	 return loanrepo.findAll();
     }
     
     public LoanApplicationModel putApplication(LoanApplicationModel amodel3)
     {
    	 return loanrepo.saveAndFlush(amodel3);
     }
     
     public void deleteApplication(int loanid)
     {
    	 loanrepo.deleteById(loanid);
     }
     
     //LoginModel
     public LoginModel postLogin(LoginModel amodel4)
     {
    	 return lrepo.save(amodel4);
     }
     
     public List<LoginModel> getLogin()
     {
    	 return lrepo.findAll();
     }
     
     public LoginModel putLogin(LoginModel amodel5)
     {
    	 return lrepo.saveAndFlush(amodel5);
     }
     
     public void deleteLogin(int id)
     {
    	 lrepo.deleteById(id);
     }
     
     //UserModel
     
     public UserModel postUser(UserModel amodel6)
     {
    	 return urepo.save(amodel6);
     }
     
     public List<UserModel> getUser()
     {
    	 return urepo.findAll();
     }
     
     public UserModel putUser(UserModel amodel7)
     {
    	 return urepo.saveAndFlush(amodel7);
     }
     
     public void deleteUser(int id)
     {
    	 urepo.deleteById(id);
     }


}
