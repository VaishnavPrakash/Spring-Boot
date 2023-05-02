package com.example.cricInfo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.cricInfo.Model.CricInfoModel;
@Repository
public interface CricInfoRepo extends JpaRepository<CricInfoModel, Integer> {

}
