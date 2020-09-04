package com.project.shoeapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoeapp.model.Product;
import com.project.shoeapp.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public List<Product> getAllProduct() {
		return repo.getAllProduct();
	}
	
	public List<Product> getAll() {
		return repo.findAll();
	}
}
