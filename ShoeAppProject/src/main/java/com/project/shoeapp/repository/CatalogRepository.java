package com.project.shoeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoeapp.model.Catalog;

public interface CatalogRepository extends JpaRepository<Catalog, Integer>{

}
