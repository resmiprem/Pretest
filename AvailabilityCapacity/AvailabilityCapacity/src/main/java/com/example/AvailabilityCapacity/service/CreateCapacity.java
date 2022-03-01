package com.example.AvailabilityCapacity.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.AvailabilityCapacity.model.Availability;
import com.example.AvailabilityCapacity.model.Capacity;

public class CreateCapacity {
	public ArrayList<Capacity> add()  
	{  
	ArrayList<Capacity> capacity = new ArrayList<Capacity>();  
	capacity.add(new Capacity("Store001", "Prod1",new Date(2021 - 10 - 29),1.0));
	capacity.add(new Capacity("Store001", "Prod2",new Date(2021 - 10 - 26),3.0));
	capacity.add(new Capacity("Store001", "Prod3",new Date(2021 - 10 - 25),2.0));
	
	return capacity;
	}
}
