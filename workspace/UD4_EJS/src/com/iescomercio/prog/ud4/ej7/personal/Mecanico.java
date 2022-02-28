package com.iescomercio.prog.ud4.ej7.personal;

public class Mecanico {

	private String nombre;
	private String telefono;
	private EspecialidadMecanico especialidad;
	
	
	public Mecanico(String nombre, String telefono, EspecialidadMecanico especialidad) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.especialidad = especialidad;

		}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public EspecialidadMecanico getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(EspecialidadMecanico especialidad) {
		this.especialidad = especialidad;
	}



	
	
	
	
}
