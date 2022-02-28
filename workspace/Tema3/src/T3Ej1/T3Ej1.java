package T3Ej1;

import java.util.Scanner;

/**
 * T3Ej1 - Diseña una aplicación que vaya pidiendo al usuario números enteros
 * positivos, hasta que el usuario introduzca un número negativo para finalizar.
 * Una vez finalizado deberá mostrar el número máximo y el mínimo.
 */

public class T3Ej1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numUser = 1;
		int max = -1; // valor maximo.
		int min = Integer.MAX_VALUE; // valor minimo introducido

		while (numUser > 0) {
			System.out.print("Introduce un numero:");
			numUser = sc.nextInt();

			if (numUser > max) {
				max = numUser;

			}
			if (numUser >= 0 && numUser < min) {
				min = numUser;
			}
		}
		System.out.println("Numero maximo: " + max);
		System.out.println("Numero minimo: " + min);
	}
}