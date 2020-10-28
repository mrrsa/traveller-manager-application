package com.msilva.travellermanager.services;

import java.util.List;

import com.msilva.travellermanager.entities.Vehicle;

public interface VehicleService {
	
	Vehicle persist(Vehicle vehicle);
	
	List<Vehicle> getVehicles();
	
	void delete(Vehicle vehicle);

}
