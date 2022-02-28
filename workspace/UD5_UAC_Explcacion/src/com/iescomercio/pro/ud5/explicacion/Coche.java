package com.iescomercio.pro.ud5.explicacion;

public class Coche extends Vehiculo{

	private String matricula;
	
	
	public void mostrarInfo() {
		
		System.out.println(super.velocidadMaxima);
		System.out.println(this.matricula);
	}
	
	public Coche(Integer velocidadMaxima, Double kgPeso, String marca, Double precio) {
		super(velocidadMaxima, kgPeso, marca, precio);

	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	
	
	
	
}
