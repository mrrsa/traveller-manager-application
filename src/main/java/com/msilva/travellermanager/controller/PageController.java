package com.msilva.travellermanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.msilva.travellermanager.dto.FormDTO;
import com.msilva.travellermanager.dto.VehicleDTO;
import com.msilva.travellermanager.mapper.VehicleMapper;
import com.msilva.travellermanager.services.VehicleService;

@Controller
public class PageController {
	
	@Autowired
	VehicleService service;
	
	@Autowired
	VehicleMapper mapper;
	
	@GetMapping("/")
	public ModelAndView homepage(ModelAndView modelandview) {
		modelandview.setViewName( "layout.html");
		return modelandview;
		
	}
	
	@GetMapping("/vehicles")
	public ModelAndView getList(ModelAndView modelandview) {
		List<VehicleDTO> vehicles =mapper.vehiclesToVehicleDTO(service.getVehicles());
		modelandview.addObject("vehicles", vehicles);
		modelandview.setViewName("vehicles-list.html");
		return modelandview;
		
	}
	@GetMapping("/form")
	public ModelAndView form(ModelAndView modelandview) {
		modelandview.setViewName( "form.html");
		FormDTO form = new FormDTO();
		form.setVehicles(mapper.vehiclesToVehicleDTO(service.getVehicles()));
		modelandview.addObject("formDTO", form);
		return modelandview;
		
	}
	
	@PostMapping("/calculate")
	public ModelAndView search(ModelAndView modelandview,@RequestParam(value = "startingPoint", required = true) String startingPoint,
	        @RequestParam(value = "endingPoint", required = true) String endingPoint,
	        @RequestParam(value = "distance", required = false) String distance,
	        @RequestParam(value = "duration", required = false) String duration,
	        @RequestParam(value = "vehicle", required = false) VehicleDTO vehicle) {
		//TODO: calcutate consume
		Integer aux = Integer.parseInt(distance)/100;
		Float aux2 =vehicle.getConsumoCombinado();
		float result = aux * aux2;
		modelandview.addObject("consume", result);
		modelandview.setViewName("form.html");
		return modelandview;
		
	}
	
	

}
