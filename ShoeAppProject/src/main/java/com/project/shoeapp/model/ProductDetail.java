package com.project.shoeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ProductDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private GenderType genderType;
	@Column(nullable = false)
	private int quantity;
	private double star;
	
	@ManyToOne
	private Product product;
	@OneToOne
	private Color color;
	@OneToOne
	private Size size;
}
