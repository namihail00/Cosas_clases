package explicacion;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Persona {

	// propiedades
	private String dni;
	private String nombre;
	private byte edad;
	private Double estatura;
	private Date fechaNacimiento;

	// constructores

	// Atributos en private
	// Constructores
	// Get/Set
	// toString / equeals(Objt)
	// Comportamiento

	public Persona() {
//		this.nombre = "Nico";
//		this.edad = 21;
//		this.estatura = 1.80;
//		this.fechaNacimiento = new Date();

		this("Nico", 18, 1.83);
	}

	public Persona(String nombre) {
		this();
		this.nombre = nombre;
		this.fechaNacimiento = new Date();
	}

	public Persona(String nombre, int edad, double estatura) {
		this.dni = "392879021L";
		this.nombre = nombre;
		this.edad = (byte) edad;
		this.estatura = estatura;
	}

	public Persona(String dni, String nombre, byte edad, Double estatura, Date fechaNacimiento) { // click derecho >
																									// source > Generate
																									// constructors
																									// using fields
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.fechaNacimiento = fechaNacimiento;
	}

	// comportamiento

	// GET

	public String getDni() {
		return this.dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Byte getEdad() {
		return this.edad;
	}

	public Double getEstatura() {
		return this.estatura;
	}

	public GregorianCalendar getFechaNac() {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(this.fechaNacimiento);

		return gc;
	}

	// SET

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(Byte edad) {
		this.edad = edad;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public void setFechaNacimiento(int anio, int mes, int dia) {
		GregorianCalendar gc = new GregorianCalendar(anio, mes + 1, dia);
		this.fechaNacimiento = gc.getTime();
	}

	public void saludar(String nombrePersona) {
		System.out.println("Hola " + nombrePersona + " encantado de conocerte");
		System.out.println("Yo me llamo " + this.nombre);
	}

	public void saludar() { // mientras no tenga la misma entrada puede haber 2 metodos iguales.
		System.out.println("Hola encantado de conocerte");
		System.out.println("Yo me llamo " + this.nombre);
	}

	public Boolean isMayorDeEdad() {
		return this.edad >= 18;
	}

	public void setEdad(int edad) {
		this.edad = (byte) edad;
	}

	public void informacion() {
		System.out.println("DNI: " + this.dni);
		System.out.println("nombre: " + this.nombre);
		System.out.println("edad: " + this.edad);
		System.out.println("mayor edad? " + this.isMayorDeEdad());
	}

	@Override
	public String toString() {
		return "Persona [dni=" + this.dni + ", nombre=" + this.nombre + ", edad=" + this.edad + ", estatura="
				+ this.estatura + ", fechaNacimiento=" + this.fechaNacimiento + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Persona p2 = (Persona) obj;
		return this.dni.equalsIgnoreCase(p2.dni);
	}

}
