package com.project.shoeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.shoeapp.dtos.ProductDetailDto;
import com.project.shoeapp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
//	@Query(value = "select p.name, picture, price, p.catalog_id, gender_type, quantity, color, size, star"
//			+ " from product p join product_detail pd where p.id = pd.product_id", nativeQuery = true)
//	List<ProductDetailDto> getAllProduct();

//	@Query("select new com.project.shoeapp.dtos.ProductDetailDto(p.name, p.picture, p.price, p.catalog, p.productDetails.genderType,"
//			+ " p.productDetails.quantity, p.productDetails.color, p.productDetails.size, p.productDetails.star) from Product p, ProductDetail pd where pd.product = p")
//	List<ProductDetailDto> getAllProduct();
	
//	@Query("SELECT pro FROM Product pro JOIN pro.productDetails proDetail")
//	List<Product> getAllProduct();
					
}
