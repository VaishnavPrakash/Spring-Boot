package com.example.connectivity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connectivity.model.LoanApplicationModel;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
