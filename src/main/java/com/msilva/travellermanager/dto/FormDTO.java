package com.msilva.travellermanager.dto;

import java.util.List;

public class FormDTO {
	
	private String startingPoint;
	private String endingPoint;
	private DistanceToDestination distance;
	private DurationToDestination duration;
	private Float startLocationLat;
	private Float startLocationLong;
	private Float endLocationLat;
	private Float endLocationLong;
	private String consume;
	private List<VehicleDTO> vehicles;
	
	public FormDTO() {
	}
	public String getStartingPoint() {
		return startingPoint;
	}
	public void setStartingPoint(String startingPoint) {
		this.startingPoint = startingPoint;
	}
	public String getEndingPoint() {
		return endingPoint;
	}
	public void setEndingPoint(String endingPoint) {
		this.endingPoint = endingPoint;
	}
	public List<VehicleDTO> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<VehicleDTO> vehicles) {
		this.vehicles = vehicles;
	}
	public DistanceToDestination getDistance() {
		return distance;
	}
	public void setDistance(DistanceToDestination distance) {
		this.distance = distance;
	}
	public DurationToDestination getDuration() {
		return duration;
	}
	public void setDuration(DurationToDestination duration) {
		this.duration = duration;
	}
	public String getConsume() {
		return consume;
	}
	public void setConsume(String consume) {
		this.consume = consume;
	}
	public Float getStartLocationLat() {
		return startLocationLat;
	}
	public void setStartLocationLat(Float startLocationLat) {
		this.startLocationLat = startLocationLat;
	}
	public Float getStartLocationLong() {
		return startLocationLong;
	}
	public void setStartLocationLong(Float startLocationLong) {
		this.startLocationLong = startLocationLong;
	}
	public Float getEndLocationLat() {
		return endLocationLat;
	}
	public void setEndLocationLat(Float endLocationLat) {
		this.endLocationLat = endLocationLat;
	}
	public Float getEndLocationLong() {
		return endLocationLong;
	}
	public void setEndLocationLong(Float endLocationLong) {
		this.endLocationLong = endLocationLong;
	}
	
	

}
