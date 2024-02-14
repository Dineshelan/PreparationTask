package com.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laptop.entity.Laptop;
import com.laptop.service.LaptopService;

@RestController
@RequestMapping(value = "/laptop")
public class LaptopController {
	
	@Autowired
	LaptopService laptopSer;
	
	@PostMapping(value = "/postAll")
	public String postAll(@RequestBody List<Laptop> l) {
		return laptopSer.postAll(l);
	}
	@GetMapping(value = "/getAll")
	public List<Laptop> getAll() {
		return laptopSer.getAll();
	}
	@PutMapping(value = "/updateData")
	public String updateData(@RequestBody Laptop l) {
		return laptopSer.updateData(l);
	}
	@PutMapping(value = "/updateData1/{id}")
	public String updateData1(@RequestBody Laptop l,@PathVariable int id) {
		return laptopSer.updataData1(l, id);
	}
	@PatchMapping(value = "/modify/{id}")
	public String updateData2(@RequestBody Laptop l,@PathVariable int id) {
		return laptopSer.updateData2(l,id);
	}
	

}
