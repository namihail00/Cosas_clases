package T1Ej7;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW T1EJ7 - El tipo short permite almacenar
 * valores entre un rango (investiga cu�l es). Escribe un programa que permita
 * al usuario comprobar que si se incrementa el valor de una variable short en 1
 * cuando tiene el m�ximo valor, el nuevo valor es el m�nimo del rango
 */

public class T1Ej7 {
	public static void main(String[] arg) {

		Scanner ms = new Scanner(System.in);

		System.out.println("Introduce el numero max. de short"); // maximo de short 32767
		short max = ms.nextShort();

		max++;

		System.out.println(max);
	}
}
