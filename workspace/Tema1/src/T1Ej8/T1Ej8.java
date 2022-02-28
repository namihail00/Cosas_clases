package T1Ej8;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ8 - Escribe un programa que permita
 * calcular la media aritmética de dos números que introduce el usuario.
 */

public class T1Ej8 {

	public static void main(String[] arg) {

		Scanner asd = new Scanner(System.in);
		System.out.println("Introduce primer numero");
		int a = asd.nextInt();
		System.out.println("Introduce primer segundo");
		int b = asd.nextInt();
		System.out.println((a + b) / 2); // sumo a+b divido entre 2 ya que solo pide 2 numeros
	}

}
