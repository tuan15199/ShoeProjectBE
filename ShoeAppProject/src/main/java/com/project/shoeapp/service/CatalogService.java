package com.project.shoeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoeapp.model.Catalog;
import com.project.shoeapp.repository.CatalogRepository;

@Service
public class CatalogService {
	@Autowired
	private CatalogRepository repo;
	
	public Catalog createCatalog(Catalog catalog) {
		return repo.save(catalog);
	}
}
