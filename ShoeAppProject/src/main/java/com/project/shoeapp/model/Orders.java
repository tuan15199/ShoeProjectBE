package com.project.shoeapp.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(length = 100, nullable = false)
	private String cusName;
	@Column(length = 12, nullable = false)
	private String phone;
	private String email;
	@Column(nullable = false)
	private String address;
	private int totalPrice;
	private String status;
	private Date orderDate;
	private Date deliveryDate;
	
	@OneToMany
	List<OrderDetail> orderDetail;
}
