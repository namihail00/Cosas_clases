package T3Ej8;

import java.util.Scanner;

/**
 * 1º DAW Nicolas Mihail Alexandru T3Ej8 - Diseña un programa que solicite al
 * usuario 10 números y devuelva la media de todos ellos.
 */
public class T3Ej8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double contador = 1; // todo con double para ahorrar problemas
		double num = 0;
		double mediaSuma = 0;
		
		System.out.println("Introduzca 10 numeros para realizar una media de todos ellos: ");
		
		while (contador <= 10) { // Mientras no pase de 10 numeros el loop sigue
			
			num = sc.nextDouble();
			mediaSuma = mediaSuma + num;
			
			contador++; // Contador esta arriba ya que pido todos lo numeros de golpe
			
		}
		System.out.println("La media de los 10 numeros es: " + mediaSuma / contador); // mensaje final + media
	}
}
