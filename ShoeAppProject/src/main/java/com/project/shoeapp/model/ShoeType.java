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
public class ShoeType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(length = 100, nullable = false)
	private Type type;
	
	@ManyToOne
	private Catalog catalog;
	@OneToMany(mappedBy = "type")
	private List<Product> products;
}
