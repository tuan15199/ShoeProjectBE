package com.project.shoeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.shoeapp.dtos.CatalogDto;
import com.project.shoeapp.model.Catalog;
import com.project.shoeapp.service.CatalogService;

@RestController
public class CatalogController {
	@Autowired
	private CatalogService service;
	
	@GetMapping(value = "catalogs")
	public List<Catalog> getAll() {
		return service.getAll();
	}
	
	@PostMapping(value = "catalog", consumes = "application/json")
	public Catalog createCatalog(@RequestBody CatalogDto catalog) {
		return service.createCatalog(catalog);
	}
}
