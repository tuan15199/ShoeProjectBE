package com.project.shoeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoeapp.model.Product;
import com.project.shoeapp.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired ProductRepository repo;
	
	public List<Product> getAll(){
		return repo.findAll();
	}
	
	public Product save(Product product) {
		return repo.save(product);
	}
	
	public Product getById(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
