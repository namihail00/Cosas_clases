package T3Ej4;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T3Ej4 - Diseña un programa que vaya pidiendo
 * al usuario números hasta que el usuario introduzca un 0. Por cada número
 * deberá mostrar: (i) si es múltiplo de 2, (ii) si es múltiplo de 7, (iii) su
 * cuadrado, y (iv) su valor absoluto.
 */
public class T3Ej4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = -1;

		while (num != 0) {

			System.out.println("Introduce un numero: ");
			num = sc.nextInt();

			if (num % 2 == 0) {
				// I
				System.out.println("Este numero es multiplo de 2");

			} else {
				if (num % 7 == 0) {
					// II
					System.out.println("Este numero es multiplo de 7");

				}
			}

			// III
			System.out.println("El cuadrado del numero es: " + num * 2);

			// IV
			if (num > 0) {
				System.out.println("El valor absoluto del numero es: " + num);
			} else {
				System.out.println("El valor absoluto del numero es: " + num * -1);
			}
		}
	}
}
