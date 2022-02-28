package com.iescomercio.pro.ud5.explicacion;

import com.iescomercio.pro.ud5.hospital.Cardiologo;
import com.iescomercio.pro.ud5.hospital.Estomatologo;
import com.iescomercio.pro.ud5.hospital.Medico;

public class Principal {

	public static void main(String[] args) {
//		Vehiculo v = new Vehiculo(10, 10.0, "Toyota", 10.0);
//		Coche n = new Coche(10, 10.0, "Toyota", 10.0);
//		v.mostrarInfo();
//		
//		System.out.println("-------------------------------");
//		
//		Bicicleta b = new Bicicleta(10, 10.0, "Toyota", 10.0, "L");
//		b.mostrarInfo();
		
		Medico m = new Medico();
		m.operar();
		
		System.out.println("---------");
		
		Cardiologo c = new Cardiologo();
		c.operar();
		
		System.out.println("---------");
		
		Estomatologo e = new Estomatologo();
		e.operar();
		
		
	}

}
