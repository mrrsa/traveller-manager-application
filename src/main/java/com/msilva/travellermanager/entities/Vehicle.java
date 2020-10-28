package com.msilva.travellermanager.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table
public class Vehicle implements Serializable{
	
	@Id
	private String matricula;
	@Column
	private String marca;
	@Column
	private String modelo;
	@Column
	private String consumo_combinado;
	
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
	public String getConsumo_combinado() {
		return consumo_combinado;
	}
	public void setConsumo_combinado(String consumo_combinado) {
		this.consumo_combinado = consumo_combinado;
	}
	
	
	

}
