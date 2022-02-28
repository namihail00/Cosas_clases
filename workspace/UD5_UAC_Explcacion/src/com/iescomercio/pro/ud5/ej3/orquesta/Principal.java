package com.iescomercio.pro.ud5.ej3.orquesta;

public class Principal {

	public static void main(String[] args) {
		
		Instrumento a = new Piano();
		a.tocarNota();
		
		
		
		Instrumento I = new Flauta();
		I.tocarNota();
		
		
		((Flauta) I).tocarFlauta();
				
	}

}
