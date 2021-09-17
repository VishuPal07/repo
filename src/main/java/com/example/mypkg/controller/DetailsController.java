package com.example.mypkg.controller;

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

import com.example.mypkg.models.Details;
import com.example.mypkg.services.DetailsServices;

@RestController
public class DetailsController {
	
	@Autowired
	DetailsServices ds;
	
	@GetMapping("/")
	private List<Details> getAllDetails()
	{
		return ds.getAllDetails();
	}
	
	@GetMapping("/")
	private Details getDetails(@PathVariable("id") int id)
	{
		return ds.getDetailsById(id);
	}
	
	@DeleteMapping("/")
	private void deleteDetails(@PathVariable("id") int id)
	{
		ds.delete(id);
	}
	
	@PostMapping("/")
	private int saveDetails(@RequestBody Details det)
	{
		ds.saveOrUpdate(det);  
		return 1;  
	}
	
	@PutMapping("/")  
	private Details update(@RequestBody Details det)   
	{  
	ds.saveOrUpdate(det);  
	return det; 
	}
	
	
	
}
