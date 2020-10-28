package com.msilva.travellermanager.dto;

public class VehicleDTO {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String consumoCombinado;
	
	public VehicleDTO() {
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getConsumoCombinado() {
		return consumoCombinado;
	}
	public void setConsumoCombinado(String consumoCombinado) {
		this.consumoCombinado = consumoCombinado;
	}

	@Override
	public String toString() {
		return "VehicleDTO [marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", consumoCombinado=" + consumoCombinado + "]";
	}
	
	
	
	
}
