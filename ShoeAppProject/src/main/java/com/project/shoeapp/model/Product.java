package com.project.shoeapp.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	@OneToMany(mappedBy = "product")
	List<ProductDetail> productDetails;
	
}
