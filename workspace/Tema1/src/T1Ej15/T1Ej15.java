package T1Ej15;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ15 - Dado un número, devuelve verdadero
 * si se encuentra en el rango de 100 a 200 (ambos incluidos). No utilizar
 * condicionales.
 */

public class T1Ej15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num >= 100 && num <= 200);

	}
}
