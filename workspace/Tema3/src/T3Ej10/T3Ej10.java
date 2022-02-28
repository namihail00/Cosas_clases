package T3Ej10;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T3Ej10 - Diseña un programa que solicite al
 * usuario un número comprendido entre el 1 y el 10 (incluidos), y muestre por
 * pantalla la tabla de multiplicar hasta el 1000. Es decir, si el usuario
 * introduce el 2, deberá mostrar: 2 4 6 … 2000
 */

public class T3Ej10 {
	public static void main(String[] args) {

		int n = 0;
		int total = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero del 1 al 10: ");
		n = sc.nextInt();

		for (int i = 0; i <= 1000; i++) {

			total = n * i;
			System.out.println(total);

			if (n <= 0 && n > 10) {
				System.out.println("Tu numero no esta entre 1 y 10!");
				break;
			}

		}

	}
}
