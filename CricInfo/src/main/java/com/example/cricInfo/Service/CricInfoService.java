package com.example.cricInfo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public CricInfoModel update(int cid,CricInfoModel u)
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
	//sorting
	public List<CricInfoModel> sortAsc(String vehicleName)
	{
		return repo.findAll(Sort.by(vehicleName).ascending());
	}
	
	public List<CricInfoModel> sortDesc(String vehicleName)
	{
		return repo.findAll(Sort.by(vehicleName).descending());
	}
	
	//pagination
	public List<CricInfoModel> paginationData(int pageNo, int pageSize)
	{
		Page<CricInfoModel> p = repo.findAll(PageRequest.of(pageNo, pageSize));
		return p.getContent();
	}
	
	//paginationAndSorting
	public List<CricInfoModel> paginationAndSorting(int pageNo,int pageSize,String vehicleName)
	{
		Page<CricInfoModel> p = repo.findAll(PageRequest.of(pageNo, pageSize, Sort.by(vehicleName).ascending()));
		return p.getContent();
	}
}
