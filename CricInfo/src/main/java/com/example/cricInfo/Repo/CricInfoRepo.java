package com.example.cricInfo.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.cricInfo.Model.CricInfoModel;
@Repository
public interface CricInfoRepo extends CrudRepository<CricInfoModel, Integer> {

}
