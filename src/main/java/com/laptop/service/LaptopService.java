package com.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.dao.LaptopDao;
import com.laptop.entity.Laptop;
import com.laptop.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	LaptopDao laptopDao;
	
	@Autowired
	LaptopRepository laptopRepo;
	
	public String postAll(List<Laptop> l) {
		return laptopDao.postAll(l);
	}
	public List<Laptop> getAll() {
		return laptopDao.getAll();
	}
	public String updateData(Laptop l) {
		return laptopDao.updateData(l);
	}
	public String updataData1(Laptop l,int id) {
		return laptopDao.updateData1(l,id);
	}
	public String updateData2(Laptop l,int id) {
		Laptop x = laptopRepo.findById(id).get();
		if(l.getPrice()>0) {
			x.setPrice(l.getPrice());
		}
		laptopRepo.save(x);
		return "Price Updated Successfully";
	}
}