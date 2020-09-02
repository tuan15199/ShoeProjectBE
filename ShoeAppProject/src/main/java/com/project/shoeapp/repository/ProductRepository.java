package com.project.shoeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoeapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
