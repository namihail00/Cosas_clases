package T2Ej7;

import java.util.Scanner;

/**
 * T2EJ7 - Nicolas Mihail Alexandru 1º DAW
 * 
 * Escribir una aplicación que solicite una nota al usuario y devuelva:
“insuficiente” si se encuentra entre 0 y 4
“aprobado” si es un 5
“bien” si es un 6
“notable” si es un 7 u 8
“sobresaliente” si es un 9 o 10
 */
public class T2Ej7 {
	public static void main(String[] args) {

		Scanner tecld = new Scanner(System.in);

		System.out.println("Introduce tu nota: ");
		int num1 = tecld.nextInt();

		if (num1 >= 0 && num1 <= 4) {
			System.out.println("Insuficiente");
		}
		if (num1 == 5) {
			System.out.println("Aprobado");
		}
		if (num1 == 6) {
			System.out.println("Bien");
		}
		if (num1 >= 7 && num1 <= 8) {
			System.out.println("Notable");
		}
		if (num1 >= 9 && num1 <= 10) {
			System.out.println("Sobresaliente");
		}
	}
}
