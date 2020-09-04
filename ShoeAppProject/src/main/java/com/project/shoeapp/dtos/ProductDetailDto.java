package com.project.shoeapp.dtos;

import com.project.shoeapp.model.GenderType;

public class ProductDetailDto {
	private String name;
	private String picture;
	private int price;
	private int catalogID;
	private GenderType genderType;
	private int quantity;
	private String color;
	private int size;
	private double star;
	
	public ProductDetailDto() {}
	
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
	public int getCatalogID() {
		return catalogID;
	}
	public void setCatalogID(int catalogID) {
		this.catalogID = catalogID;
	}
	public GenderType getGenderType() {
		return genderType;
	}
	public void setGenderType(GenderType genderType) {
		this.genderType = genderType;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public double getStar() {
		return star;
	}
	public void setStar(double star) {
		this.star = star;
	}
	
}
