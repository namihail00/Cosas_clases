package T2Ej6;

import java.util.Scanner;

/**
 * T2EJ6 - Nicolas Mihail Alexandru 1º DAW
 * 
 * Solicita tres números al usuario y muéstralos por consola de menor a
 * mayor.
 * 
 */

public class T2Ej6 {
	public static void main(String[] args) {

		Scanner tecld = new Scanner(System.in);

		System.out.println("Introduce tres números: ");
		int num1 = tecld.nextInt();
		int num2 = tecld.nextInt();
		int num3 = tecld.nextInt();

		if (num1 > num2 && num1 > num3) {

			// NUMERO 1 COMO MAYOR
			if (num2 > num3) {
				System.out.println(num1 + " " + num2 + " " + num3);

			} else {
				System.out.println(num1 + " " + num3 + " " + num2);

			}
		}
		// NUMERO 2 COMO MAYOR
		if (num2 > num1 && num2 > num3) {

			if (num1 > num3) {
				System.out.println(num2 + " " + num1 + " " + num3);

			} else {
				System.out.println(num2 + " " + num3 + " " + num1);

			}
		}

		// NUMERO 3 COMO MAYOR
		if (num3 > num2 && num3 > num1) {

			if (num2 > num1) {
				System.out.println(num3 + " " + num2 + " " + num1);

			} else {
				System.out.println(num3 + " " + num1 + " " + num2);

			}
		}
	}
}
