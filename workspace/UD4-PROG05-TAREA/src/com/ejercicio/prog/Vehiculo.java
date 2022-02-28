package com.ejercicio.prog;

import java.time.LocalDate;
import java.util.Date;

public class Vehiculo {

	private String marca;
	private String matricula;
	private Integer kilometros;
	private Date fechaMatriculacion;
	private String descripcion;
	private Double precio;
	private Propietario propietario;
	private Propietario dni;

	
	
	


public Vehiculo(String marca, String matricula, Integer kilometros, Date fechaMatriculacion, String descripcion,
			Double precio, Propietario propietario, Propietario dni) {
		super();
		this.marca = marca;
		this.matricula = matricula;
		this.kilometros = kilometros;
		this.fechaMatriculacion = fechaMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.propietario = propietario;
		this.dni = dni;
	}

// conseguir anios del coche
	public Long getAnios() {
		Date now = new Date();
		Long diferencia = now.getTime() - this.fechaMatriculacion.getTime();
		return diferencia / (1000*3600*24*365);
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Integer getKilometros() {
		return kilometros;
	}

	public void setKilometros(Integer kilometros) {
		this.kilometros = kilometros;
	}

	public Date getFechaMatriculacion() {
		return fechaMatriculacion;
	}

	public void setFechaMatriculacion(Date fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

}
