package com.nagarro.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ProductDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long detailId;
	private String size;
	private String price;
	private String design;
	
	
	
	public ProductDetails() {
		super();
	}

	public ProductDetails(long detailId, String size, String price, String design) {
		super();
		this.detailId = detailId;
		this.size = size;
		this.price = price;
		this.design = design;
	}
	
	public long getDetailId() {
		return detailId;
	}
	public void setDetailId(long detailId) {
		this.detailId = detailId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	
	
	
	
	
}
