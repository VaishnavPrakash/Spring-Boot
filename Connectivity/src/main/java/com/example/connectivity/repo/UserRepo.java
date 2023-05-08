package com.example.connectivity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connectivity.model.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Integer> {

}
