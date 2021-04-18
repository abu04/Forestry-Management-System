package com.cg.fms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="product_id")
	int productId;
	@Column(name="product_name")
	String productName;
	@Column(name="product_quantity")
	String ProductQuantity;
	@Column(name="product_description")
	String productDescription;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String productQuantity, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		ProductQuantity = productQuantity;
		this.productDescription = productDescription;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQuantity() {
		return ProductQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		ProductQuantity = productQuantity;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", ProductQuantity="
				+ ProductQuantity + ", productDescription=" + productDescription + "]";
	}
	
}
