package com.project.shoeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoeapp.dtos.CatalogDto;
import com.project.shoeapp.model.Brand;
import com.project.shoeapp.model.Catalog;
import com.project.shoeapp.repository.BrandRepository;
import com.project.shoeapp.repository.CatalogRepository;

@Service
public class CatalogService {
	@Autowired
	private CatalogRepository repo;
	@Autowired
	private BrandRepository brandRepo;
	
	public List<Catalog> getAll() {
		return repo.findAll();
	}
	
	public Catalog createCatalog(CatalogDto catalogDto) {
		Integer brandId = catalogDto.getBrandId();
	    Brand brand = null;

	    if (brandId != null) {
	      if (brandRepo.findById(brandId).isPresent()) {
	        brand = brandRepo.findById(brandId).get();
	      } else {
	        throw new NullPointerException();
	      }
	    }

	    Catalog newCatalog = new Catalog(catalogDto, brand);
	    newCatalog = repo.save(newCatalog);
	    return newCatalog;
	}
}
