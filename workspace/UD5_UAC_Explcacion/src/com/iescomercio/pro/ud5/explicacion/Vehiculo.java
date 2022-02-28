package com.iescomercio.pro.ud5.explicacion;

public class Vehiculo {

	protected Integer velocidadMaxima;
	protected Double kgPeso;
	protected String marca;
	protected Double precio;
	
	
	
	public Vehiculo(Integer velocidadMaxima, Double kgPeso, String marca, Double precio) {
		this.velocidadMaxima = velocidadMaxima;
		this.kgPeso = kgPeso;
		this.marca = marca;
		this.precio = precio;
	}
	
	public void mostrarInfo() {
		System.out.println("Vehiculo: "+this.marca +" "+this.precio);
		
		
	}
	
	
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public Double getKgPeso() {
		return kgPeso;
	}
	public void setKgPeso(Double kgPeso) {
		this.kgPeso = kgPeso;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
}
