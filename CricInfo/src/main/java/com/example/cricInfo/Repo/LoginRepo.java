package com.example.cricInfo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cricInfo.Model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {
	LoginModel findByuname(String name);
}
