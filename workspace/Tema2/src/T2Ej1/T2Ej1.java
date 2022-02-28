package T2Ej1;

import java.util.Scanner;

/**  Nicolas Mihail Alexandru 1º DAW
	T2Ej1 - Escribe un programa que solicite al usuario un número entero al usuario y que
	devuelva por consola si es positivo o negativo. 
 * */
public class T2Ej1 {
	public static void main(String[] args) {

		int num;
		Scanner tecld = new Scanner(System.in);
		System.out.println("Introduzca el numero!: ");

		num = tecld.nextInt();
		if (num > 0) {
			System.out.println("Tu numero es positivo!");
		}

		else {
			System.out.println("Tu numero es negativo!");
		}

	}
}
