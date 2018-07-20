package com.test.microservice.models;

import java.util.Date;

public class PaymentForm {

	private long id; 
	private String nombre;
	private String apellido;
	private String torneo;
	private Date fechaDePago;
	
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTorneo() {
		return torneo;
	}
	public void setTorneo(String torneo) {
		this.torneo = torneo;
	}
	public Date getFechaDePago() {
		return fechaDePago;
	}
	public void setFechaDePago(Date fechaDePago) {
		this.fechaDePago = fechaDePago;
	}
	public PaymentForm(long id, String nombre, String apellido, String torneo, Date fechaDePago) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.torneo = torneo;
		this.fechaDePago = fechaDePago;
	}
}
