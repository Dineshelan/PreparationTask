package com.laptop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.laptop.entity.Laptop;
import com.laptop.repository.LaptopRepository;

@Repository
public class LaptopDao {
	
	@Autowired
	LaptopRepository laptopRepo;
	
	
	public String postAll(List<Laptop> l) {
		laptopRepo.saveAll(l);
		return "Saved All Successfully";
	}
	public List<Laptop> getAll() {
		return laptopRepo.findAll();
	}
	public String updateData(Laptop l) {
		laptopRepo.save(l);
		return "Updated Successfully";
	}
	public String updateData1(Laptop l,int id) {
		Laptop x = laptopRepo.findById(id).get();
		if(l.getModel()!=null) {
			x.setModel(l.getModel());
		}
		laptopRepo.save(x);
		return "Model Updated Successfully";
	}
}