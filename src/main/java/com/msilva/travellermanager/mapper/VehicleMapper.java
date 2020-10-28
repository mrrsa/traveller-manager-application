package com.msilva.travellermanager.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.msilva.travellermanager.dto.VehicleDTO;
import com.msilva.travellermanager.entities.Vehicle;

@Mapper(componentModel="spring")
public interface VehicleMapper {

	@Mapping(source="consumo_combinado", target = "consumoCombinado")
	VehicleDTO vehicleToVehicleDTO(Vehicle car);
	
	@Mapping(source="consumoCombinado", target = "consumo_combinado")
	Vehicle vehicleDTOToVehicle(VehicleDTO person);

	@Mapping(source="consumo_combinado", target = "consumoCombinado")
	List<VehicleDTO> vehiclesToVehicleDTO(List<Vehicle> car);
}
