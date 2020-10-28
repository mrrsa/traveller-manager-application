package com.msilva.travellermanager.dto;

public class Coordenadas {
	
	Float lat;
	Float lng;
	
	public Coordenadas(Float lat, Float lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	public Float getLat() {
		return lat;
	}
	public void setLat(Float lat) {
		this.lat = lat;
	}
	public Float getLng() {
		return lng;
	}
	public void setLng(Float lng) {
		this.lng = lng;
	}
	
	

}
