package com.example.cricInfo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cricInfo.Model.CricInfoModel;
import com.example.cricInfo.Repo.CricInfoRepo;

@Service
public class CricInfoService {
	@Autowired
	private CricInfoRepo repo;
	
	public CricInfoModel save(CricInfoModel a)
	{
		return repo.save(a);
	}
	public CricInfoModel update(CricInfoModel u)
	{
		return repo.save(u);
	}
	
	public List<CricInfoModel> findAllCric()
	{
		return (List<CricInfoModel>) repo.findAll();
	}
	
	public void delete(int id)
	{
		repo.deleteById(id);
	}
	
	
}
