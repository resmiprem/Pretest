package com.example.AvailabilityCapacity.model;
import java.util.Date;
public class Capacity {
	String storeNo;
	String productId;
	Date date;
	Double  noOfOrdersAccepted;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Double getNoOfOrdersAccepted() {
		return noOfOrdersAccepted;
	}
	public void setNoOfOrdersAccepted(Double noOfOrdersAccepted) {
		this.noOfOrdersAccepted = noOfOrdersAccepted;
	}
	public Capacity(String storeNo, String productId, Date date, Double noOfOrdersAccepted) {
		super();
		this.storeNo = storeNo;
		this.productId = productId;
		this.date = date;
		this.noOfOrdersAccepted = noOfOrdersAccepted;
	}
	
}
