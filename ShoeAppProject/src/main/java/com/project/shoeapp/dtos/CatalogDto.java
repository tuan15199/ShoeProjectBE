package com.project.shoeapp.dtos;

import com.project.shoeapp.model.Type;

public class CatalogDto {
	private Type type;
	private Integer brandId;
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	
}
