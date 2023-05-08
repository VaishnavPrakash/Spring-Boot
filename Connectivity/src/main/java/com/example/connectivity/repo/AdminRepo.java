package com.example.connectivity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connectivity.model.AdminModel;

public interface AdminRepo extends JpaRepository<AdminModel, String > {

}
