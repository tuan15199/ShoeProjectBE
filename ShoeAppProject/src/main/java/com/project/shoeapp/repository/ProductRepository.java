package com.project.shoeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.shoeapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	@Query(value = "select p.name from product p join product_detail pd where p.id = pd.product_id", nativeQuery = true)
	List<Product> getAllProduct();
					
}
