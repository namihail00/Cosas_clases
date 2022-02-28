package T1Ej10;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ10 - Escribe un programa que devuelva un
 * número entero obtenido de truncar un número con decimales introducido por el
 * usuario.
 */

public class T1Ej10 {
	public static void main(String[] args) {

		System.out.println("Introduce un double: ");

		Scanner asd = new Scanner(System.in);

		double x = asd.nextDouble();

		int z = (int) x;
		System.out.println(z);

	}
}
