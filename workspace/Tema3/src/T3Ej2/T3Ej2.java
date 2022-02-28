package T3Ej2;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW T3Ej2 - Dise�a una aplicaci�n que vaya
 * pidiendo al usuario n�meros enteros positivos entre el 100 y el 300
 * (inclusive), hasta que el usuario introduzca un n�mero negativo para
 * finalizar. Una vez finalizado deber� mostrar el n�mero m�ximo y el m�nimo. En
 * caso de introducir un n�mero que no se encuentra entre 100 y 300 (inclusive)
 * no se tendr� en cuenta.
 */
public class T3Ej2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numUsu = 100;
		int max = -1;
		int min = Integer.MAX_VALUE;

		while (numUsu > 0 && (numUsu >= 100 || numUsu <= 300)) {
			System.out.println("Introduce un numero: ");
			numUsu = sc.nextInt();

			if (numUsu > max && (numUsu >= 100 && numUsu <= 300)) {
				max = numUsu;

			}
			if (numUsu >= 0 && (numUsu >= 100 && numUsu <= 300)) {
				min = numUsu;

			}
		}
		System.out.println("Numero maximo: " + max);
		System.out.println("Numero minimo: " + min);
	}
}
