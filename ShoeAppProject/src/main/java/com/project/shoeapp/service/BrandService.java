package com.project.shoeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoeapp.model.Brand;
import com.project.shoeapp.repository.BrandRepository;

@Service
public class BrandService {
	@Autowired
	private BrandRepository repo;
	
	public List<Brand> getAll() {
		return repo.findAll();
	}
	
	public Brand createBrand(Brand input) {
	    return repo.save(input);
	 }
}
