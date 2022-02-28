package T1Ej11;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ11 - Escribe un programa que pida al
 * usuario su edad y devuelva si es mayor de edad. No utilizar condicionales.
 */

public class T1Ej11 {
	public static void main(String[] args) {

		Scanner asd = new Scanner(System.in);

		System.out.println("Dime tu edad: ");
		int edad = asd.nextInt();

		System.out.println(edad >= 18);
	}
}
