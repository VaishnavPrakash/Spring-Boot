package com.example.database.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.model.LoginModel;

public interface LoginRepo extends JpaRepository<LoginModel, Integer> {
	LoginModel findByuname(String name);
}
