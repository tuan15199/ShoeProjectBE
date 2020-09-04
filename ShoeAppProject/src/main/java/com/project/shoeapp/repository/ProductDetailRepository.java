package com.project.shoeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.shoeapp.model.ProductDetail;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer>{

}
