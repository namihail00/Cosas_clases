package T3Ej9;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW T3Ej9 - Dise�a un programa que solicite al
 * usuario un n�mero n y muestre la suma de los n primeros n�meros. Por ejemplo,
 * si el usuario introduce un 3 el programa devolver� 6 ya que 1+2+3 es igual a
 * 6.
 */

public class T3Ej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 0;
		int suma = 0;
		int contador = 0;

		System.out.println("Introduce la cantidad de numeros que quieres sumar: ");
		n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			suma = suma + i;

		}
		System.out.println("La suma de los " + n + " numeros que has introducido es: " + suma);
	}
}
    