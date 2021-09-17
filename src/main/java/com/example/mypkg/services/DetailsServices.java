package com.example.mypkg.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mypkg.models.*;
import com.example.mypkg.reposirty.DetailsRepositry;

@Service
public class DetailsServices {

	@Autowired
	DetailsRepositry dr;
	
	public List<Details> getAllDetails()   
	{  
	List<Details> det = new ArrayList<Details>();  
	dr.findAll().forEach(det1 -> det.add(det1));  
	return det;  
	}  
	
	public Details getDetailsById(int id)   
	{  
	return dr.findById(id).get();  
	} 
	
	public void saveOrUpdate(Details det)   
	{  
	dr.save(det);  
	} 
	
	public void delete(int id)   
	{  
	dr.deleteById(id);  
	}  
	
	public void update(Details det, int id)   
	{  
	dr.save(det);  
	} 
	
}
