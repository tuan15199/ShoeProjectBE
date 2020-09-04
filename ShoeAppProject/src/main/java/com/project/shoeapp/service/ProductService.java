package com.project.shoeapp.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoeapp.dtos.CatalogDto;
import com.project.shoeapp.dtos.ProductDto;
import com.project.shoeapp.model.Brand;
import com.project.shoeapp.model.Catalog;
import com.project.shoeapp.model.Product;
import com.project.shoeapp.repository.CatalogRepository;
import com.project.shoeapp.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	@Autowired
	private ProductRepository repo;
	@Autowired
	private CatalogRepository catalogRepo;
	
	public List<Product> getAll() {
		return repo.findAll();
	}
	
	public Optional<Product> getById(int id) {
		return repo.findById(id);
	}
	
	public Product createProduct(ProductDto productDto) {
		Integer catalogId = productDto.getCatalogId();
	    Catalog catalog = null;

	    if (catalogId != null) {
	      if (catalogRepo.findById(catalogId).isPresent()) {
	    	  catalog = catalogRepo.findById(catalogId).get();
	      } else {
	        throw new NullPointerException();
	      }
	    }

	    Product newProduct = new Product(productDto, catalog);
	    newProduct = repo.save(newProduct);
	    return newProduct;
	}
	
}
