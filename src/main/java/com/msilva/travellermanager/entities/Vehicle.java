package com.msilva.travellermanager.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@SuppressWarnings("serial")
@Entity
@Table
public class Vehicle implements Serializable{
	
	@Id
	private String matricula;
	@Column
	@NotBlank(message = "Marca is mandatory")
	private String marca;
	@Column
	@NotBlank(message = "Modelo is mandatory")
	private String modelo;
	@Column
	@NotBlank(message = "Consumo is mandatory")
	private Float consumo_combinado;
	
	public Vehicle() {
		
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
	public Float getConsumo_combinado() {
		return consumo_combinado;
	}
	public void setConsumo_combinado(Float consumo_combinado) {
		this.consumo_combinado = consumo_combinado;
	}
	
	
	

}
