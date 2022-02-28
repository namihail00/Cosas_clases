package T1Ej16;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ16- Dado un número, devuelve verdadero si
 * se encuentra fuera del rango de 100 a 200 (ambos incluidos). No utilizar
 * condicionales
 * 
 */

public class T1Ej16 {
	public static void main(String[] args) {

		Scanner asd = new Scanner(System.in);
		int num = asd.nextInt();
		System.out.println(num <= 100 || num >= 200);
	}
}
