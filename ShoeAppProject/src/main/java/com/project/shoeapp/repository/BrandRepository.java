package com.project.shoeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoeapp.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{

}
