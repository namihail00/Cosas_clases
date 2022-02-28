package com.iescomercio.prog.ud4.ej11.instituto;

import java.util.Date;

import java.util.HashSet;

public class Profesor {

	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNacimiento;
	private Integer sueldo;
	private Departamento departamento;
	private HashSet<Modulo> modulos;
	
}
