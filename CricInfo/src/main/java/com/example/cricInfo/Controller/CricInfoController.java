package com.example.cricInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cricInfo.Model.CricInfoModel;
import com.example.cricInfo.Repo.CricInfoRepo;
import com.example.cricInfo.Service.CricInfoService;

@RestController
@RequestMapping("/stu")
public class CricInfoController {
	@Autowired
	public CricInfoService obj;
	
	@PostMapping("/pocric")
	public CricInfoModel addDetails(@RequestBody CricInfoModel a)
	{
		return obj.save(a);
	}
	@GetMapping("/gcric")
	public List<CricInfoModel> getDetails()
	{
		return obj.findAllCric();
	}
	@PutMapping("/pcric/{cid}")
	public CricInfoModel updateDetails(@PathVariable int cid,@RequestBody CricInfoModel a)
	{
		return obj.update(cid,a);
	}
	@DeleteMapping("/dcric/{cid}")
	public String deleteDetails(@PathVariable("cid")int mid)
	{
		obj.delete(mid);
		return "Deleted Sucessfully";
	}
	
	@Autowired
	public CricInfoRepo grepo;
	@GetMapping("/sortAsc/{name}")
	public List<CricInfoModel> sortAscend(@PathVariable("name") String vehicleName)
	{
		return obj.sortAsc(vehicleName);
	}
	@GetMapping("/sortDesc/{name}")
	public List<CricInfoModel> sortDesc(@PathVariable("name") String vehicleName)
	{
		return obj.sortDesc(vehicleName);
	}
	
	@GetMapping("/pagination/{pageNo}/{pageSize}")
	public List<CricInfoModel> paginationData(@PathVariable("pageNo")int pnu,@PathVariable("pageSize") int psize)
	{
		return obj.paginationData(pnu,psize);
	}
	
	@GetMapping("/pagiantionAndSorting/{pageNo}/{pageSize}/{name}")
	public List<CricInfoModel> paginationAndSorting(@PathVariable("pageNo") int pnu,@PathVariable("pageSize") int psize,@PathVariable("name") String name)
	{
		return obj.paginationAndSorting(pnu, psize, name);
	}
	
	
}
