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
	
	@PutMapping("/pcric")
	
	public CricInfoModel updateDetails(@RequestBody CricInfoModel cid)
	{
		return obj.update(cid);
	}
	
	@DeleteMapping("/dcric/{cid}")
	public String deleteDetails(@PathVariable("cid")int mid)
	{
		obj.delete(mid);
		return "Deleted Sucessfully";
	}
}
