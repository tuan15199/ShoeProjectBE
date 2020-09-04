package com.project.shoeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoeapp.dtos.ProductDto;
import com.project.shoeapp.model.Product;
import com.project.shoeapp.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/products")
	public List<Product> listProduct() {
		return service.getAll();
	}
	
	@GetMapping(value = "/product/{id}")
	public Product getById(@PathVariable int id) {
		return service.getById(id).orElse(null);
	}
	
	@PostMapping(value = "product", consumes = "application/json")
	public Product createProduct(@RequestBody ProductDto product) {
		return service.createProduct(product);
	}
}
