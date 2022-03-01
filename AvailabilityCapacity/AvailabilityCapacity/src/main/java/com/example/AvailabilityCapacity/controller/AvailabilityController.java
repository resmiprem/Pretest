package com.example.AvailabilityCapacity.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AvailabilityCapacity.model.Availability;
import com.example.AvailabilityCapacity.service.CreateAvailability;


@RestController
public class AvailabilityController {
	@Autowired  
	private CreateAvailability availability;  
	//mapping the getProduct() method to /product  
	@GetMapping(value = "/getDatesByservice")  
	public Availability getAvailability(@RequestParam String storeNo,@RequestParam String productId,
			@RequestParam Double availQty)   
	{  
		Availability expectedAvailable=null;
		ArrayList<Availability> a = availability.add();
		for (Availability s : a) {
	         if(s.getStoreNo().equals(storeNo)&&s.getAvailQty().equals(availQty)&&s.getProductId().equals(productId)) {
	        	 expectedAvailable=s; 
	         }
	      }
	Date availableDate=	expectedAvailable.getDate();
	   
	    
	return expectedAvailable;  
	}  
	
}
