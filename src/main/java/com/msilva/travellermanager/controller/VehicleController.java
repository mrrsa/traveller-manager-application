package com.msilva.travellermanager.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msilva.travellermanager.dto.VehicleDTO;
import com.msilva.travellermanager.entities.Vehicle;
import com.msilva.travellermanager.mapper.VehicleMapper;
import com.msilva.travellermanager.services.VehicleService;

@RestController
@RequestMapping("/vehicles-api")
@CrossOrigin(origins = "*")
public class VehicleController {
	@Autowired
	VehicleService service;

	@Autowired
	VehicleMapper mapper;

	@GetMapping
	public ResponseEntity<List<VehicleDTO>> getVehiclesList() {
		List<Vehicle> aux = service.getVehicles();
		return ResponseEntity.ok(mapper.vehiclesToVehicleDTO(aux));
	}

	@PostMapping
	public ResponseEntity<VehicleDTO> saveVehicle(@Valid @RequestBody VehicleDTO vehicleDto, BindingResult result) {
		Vehicle response = service.persist(mapper.vehicleDTOToVehicle(vehicleDto));

		return ResponseEntity.ok(mapper.vehicleToVehicleDTO(response));
	}

	@DeleteMapping
	public ResponseEntity<String> removeVehicle(@Valid @RequestBody VehicleDTO vehicleDto) {
		service.delete(mapper.vehicleDTOToVehicle(vehicleDto));
		return ResponseEntity.ok("ok");
	}

}
