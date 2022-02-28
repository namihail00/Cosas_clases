package T1Ej12;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW 
 * T1EJ12 - Escribe un programa que pida al
 * usuario un número y devolverá true si es par y false si no es par. No
 * utilizar condicionales.
 * 
 */

public class T1Ej12 {
	public static void main(String[] args) { // numero%2 == 0

		Scanner edd = new Scanner(System.in);

		int edad = edd.nextInt();
		System.out.println("Tu edad es par?");
		System.out.println(edad % 2 == 0);

	}
}
