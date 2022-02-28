package principal;

import java.util.Date;

import explicacion.Persona;

public class Principal {

	public static void main(String[] args) {
//		Persona p = new Persona();
//		System.out.println(p.nombre);
//		System.out.println(p.edad);
//		System.out.println(p.estatura);
//		System.out.println(p.fechaNacimiento);
//		System.out.println();
//		
//		Persona p2 = new Persona("Niklas");
//		System.out.println(p2.nombre);
//		System.out.println(p2.edad);
//		System.out.println(p2.estatura);
//		System.out.println(p2.fechaNacimiento);
//		System.out.println();
//		
//		p=p2;
//		System.out.println(p.nombre);
		
		Persona p = new Persona("111", "Nico", (byte)21, 1.95, new Date());	
		Persona p2 = new Persona("111", "Nico", (byte)21, 1.95, new Date());
		
		if(p.equals(p2)) {
			System.out.println("Las dos personas son la mismas");
		}else {
			System.out.println("Las personas son diferentes");
		}
		
		

//		p.saludar("Alex");
//		System.out.println(p.isMayorDeEdad());
//		p.informacion();
//
//		p.setEdad(17);
//		p.informacion();
		
	}
	

}
