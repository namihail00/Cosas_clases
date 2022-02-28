package com.iescomercio.prog.ud4.ej7.personal;

public class Maquinista {

	
	private String nombre;
	private String dni;
	private Double sueldo;
	private String rango;
	
	public Maquinista(String nombre, String dni, Double sueldo, String rango) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		this.rango = rango;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}
	
	
	
}
