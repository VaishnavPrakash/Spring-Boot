package com.example.connectivity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.connectivity.model.LoginModel;

@Repository
public interface LoginRepo extends JpaRepository<LoginModel, Integer> {

}
