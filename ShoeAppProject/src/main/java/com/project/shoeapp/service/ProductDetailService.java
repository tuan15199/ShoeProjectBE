package com.project.shoeapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shoeapp.model.Product;
import com.project.shoeapp.model.ProductDetail;
import com.project.shoeapp.repository.ProductDetailRepository;
import com.project.shoeapp.repository.ProductRepository;

@Service
@Transactional
public class ProductDetailService {
	@Autowired 
	private  ProductDetailRepository repo;
	@Autowired
	private ProductRepository productRepo;
	
	public ProductDetail createProDetail(ProductDetail productDetail) {
		Integer productId = productDetail.getProductId();
	    Product product = null;

	    if (productId != null) {
	      if (productRepo.findById(productId).isPresent()) {
	    	  product = productRepo.findById(productId).get();
	      } else {
	        throw new NullPointerException();
	      }
	    }

	    ProductDetail newProductDetail = repo.save(productDetail);
	    List<ProductDetail> proDetails = product.getProductDetails();
	    proDetails.add(newProductDetail);
	    product.setProductDetails(proDetails);
	    return newProductDetail;
	}
	
}
