package com.project.shoeapp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.project.shoeapp.dtos.CatalogDto;
import com.project.shoeapp.dtos.ProductDetailDto;
import com.project.shoeapp.dtos.ProductDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private String name;
	@Column(length = 100)
	private String picture;
	private int price;

	@ManyToOne
	private Catalog catalog;
	@OneToMany
	List<ProductDetail> productDetails = new ArrayList<ProductDetail>();
	
	public Product() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public List<ProductDetail> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(List<ProductDetail> productDetails) {
		this.productDetails = productDetails;
	}
	
	public Product(ProductDto productDto , Catalog catalog) {
		this.setName(productDto.getName());
		this.setPicture(productDto.getPicture());
		this.setPrice(productDto.getPrice());
	    this.setCatalog(catalog);
	 }

}
