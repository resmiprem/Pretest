package com.example.AvailabilityCapacity.model;
import java.util.Date;
public class Availability {
	String storeNo ;
	String productId;
	Double availQty;
	Date date;
	public String getStoreNo() {
		return storeNo;
	}
	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public Double getAvailQty() {
		return availQty;
	}
	public void setAvailQty(Double availQty) {
		this.availQty = availQty;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Availability(String storeNo, String productId, Double availQty, Date date) {
		
		this.storeNo = storeNo;
		this.productId = productId;
		this.availQty = availQty;
		this.date = date;
	}
	
	
}
