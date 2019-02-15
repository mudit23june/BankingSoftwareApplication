package com.capgemini.takehome.bean;

public class Product {
	
	private int productID;
	private String productName;
	private String productCategory;
	private int productPrice;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productPrice=" + productPrice + "]";
	}
	public Product(int productID, String productName, String productCategory, int productPrice) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
	}
	public Product() {
		super();
	}
	
	
}
