package T1Ej9;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW 
 * T1EJ9 - Escribe un programa que calcule la
 * longitud y el área de una circunferencia. Para ello, el usuario debe
 * introducir el radio (puede haber decimales). Longitud = 2*Pi*radio Area =
 * Pi*radio*radio
 */

public class T1Ej9 {
	public static void main(String[] args) {
		final double PI;
		PI = 34.14;
		Scanner circ = new Scanner(System.in);
		System.out.println("Introduzca el radio de su circunferencia: ");
		double radio = circ.nextDouble();

		double longitud = 2 * PI * radio;
		System.out.println("Su Longitud es: " + longitud);

		double area = PI * radio * radio;
		System.out.println("Su Area es: " + area);

		// Longitud = 2*Pi*radio
		// Area = Pi*radio*radio
	}
}
