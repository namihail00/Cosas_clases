package T1Ej19;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ19 - Escribe un programa que calcule el
 * precio con IVA de un producto. El usuario deberá introducir el precio del
 * producto y el IVA a aplicar. El programa devolverá el precio del producto
 * aplicándole el IVA.
 * 
 */

public class T1Ej19 {
	public static void main(String[] args) {

		Scanner tecld = new Scanner(System.in);

		System.out.println("Introduzca el IVA a aplicar con numeros de 0 a 100:");
		final int IVA = tecld.nextInt();

		System.out.println("Introduzca el precio del producto :");
		int precioProd = tecld.nextInt();

		int precioFinal = ((precioProd * IVA) / 100) + precioProd;
		System.out.println("El precio final es: " + precioFinal + "€");
	}
}
