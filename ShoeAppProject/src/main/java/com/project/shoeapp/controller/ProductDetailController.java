package com.project.shoeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoeapp.model.ProductDetail;
import com.project.shoeapp.service.ProductDetailService;

@RestController
public class ProductDetailController {
	@Autowired
	private ProductDetailService service;
	
	@PostMapping(value = "productDetail", consumes = "application/json")
	public ProductDetail createProDetail(@RequestBody ProductDetail productDetail) {
		return service.createProDetail(productDetail);
	}
}
