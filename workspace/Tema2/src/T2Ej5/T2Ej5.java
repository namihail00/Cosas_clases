package T2Ej5;

import java.util.Scanner;

/**
 * T2EJ5 - Nicolas Mihail Alexandru 1º DAW
 * 
 * Solicita dos números al usuario y mostrarlos por consola de forma
 * ordenada descendente (de mayor a menor)
 */

public class T2Ej5 {
	public static void main(String[] args) {

		Scanner tecld = new Scanner(System.in);

		System.out.println("Introduce un dos números: ");
		int num1 = tecld.nextInt();
		int num2 = tecld.nextInt();

		if (num1 > num2) {
			System.out.println("Tus números es orden descendente son:");
			System.out.println(num1);
			System.out.println(num2);
		} else {

			System.out.println("Tus números es orden descendente son:");
			System.out.println(num2);
			System.out.println(num1);
		}

	}
}
