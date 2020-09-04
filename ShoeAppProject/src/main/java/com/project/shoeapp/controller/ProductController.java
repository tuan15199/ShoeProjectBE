package com.project.shoeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoeapp.model.Product;
import com.project.shoeapp.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@GetMapping(value = "/products")
	public List<Product> listProduct() {
		return service.getAllProduct();
	}
	
	@GetMapping(value = "/listProducts")
	public List<Product> products() {
		return service.getAll();
	}
}
