package com.project.shoeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoeapp.model.Brand;
import com.project.shoeapp.service.BrandService;

@RestController
public class BrandController {
	@Autowired
	private BrandService service;
	
	@GetMapping(value = "/brands")
	public List<Brand> getAll() {
		return service.getAll();
	}
	
	@PostMapping(value = "/brand", consumes = "application/json")
	public Brand createBrand(@RequestBody Brand brand) {
		return service.createBrand(brand);
	}
}
