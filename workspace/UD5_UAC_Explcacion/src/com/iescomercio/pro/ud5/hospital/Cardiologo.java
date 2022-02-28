package com.iescomercio.pro.ud5.hospital;

public class Cardiologo extends Medico {

	@Override
	public void operar() {
		System.out.println("Operacion de corazon");
	}

	public void ponerByPass() {
		System.out.println("Poner bypass");
	}

}
