package com.msilva.travellermanager.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msilva.travellermanager.entities.Vehicle;
import com.msilva.travellermanager.repositories.VehicleRepository;


@Service
public class VehicleServiceImpl implements VehicleService{
	
	@Autowired
	VehicleRepository repository;

	@Override
	public Vehicle persist(Vehicle vehicle) {
		return repository.save(vehicle);
	}

	@Override
	public List<Vehicle> getVehicles() {
		return repository.findAll();
	}

	@Override
	public void delete(Vehicle vehicle) {
		repository.delete(vehicle);
		
	}

}
