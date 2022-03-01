package com.example.AvailabilityCapacity.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.Date;
import com.example.AvailabilityCapacity.model.Availability;



@Service
public class CreateAvailability {
	public ArrayList<Availability> add()  
	{  
		ArrayList<Availability> availability=  new ArrayList<Availability>();  
	availability.add(new Availability("Store001", "Prod1",  1.0,new Date(2021 - 10 - 29)));
	availability.add(new Availability("Store001", "Prod2", 3.0,new Date(2021 - 10 - 26)));
	availability.add(new Availability("Store001", "Prod3",  2.0,new Date(2021 - 10 - 25)));
	return availability;
	}  
}
