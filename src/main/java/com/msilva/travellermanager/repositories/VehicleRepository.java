package com.msilva.travellermanager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msilva.travellermanager.entities.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String>{
	
	

}
