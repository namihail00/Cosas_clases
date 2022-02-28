package T3Ej3;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW T3Ej3 - Dise�a una aplicaci�n que vaya
 * pidiendo al usuario n�meros enteros positivos, hasta que el usuario
 * introduzca un n�mero negativo para finalizar. Una vez finalizado deber�
 * mostrar la media de los n�meros introducidos (exluyendo el negativo).
 */
public class T3Ej3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double cantidadNum = 0; // Esta es la variable de veces que se repite el bucle osease el numero de
								// numeros introducidos
		double media = 0; // Variable que usar� para sumar los positivos a introducir
		double positivo = 0; // Numero/Numeros a introducir para hacer la media

		System.out.println("Introduce una serie de n�meros, introduce -1 cuando quieras finalizar: ");
		positivo = sc.nextDouble();

		while (positivo != -1) {

			media = media + positivo; // La media es la suma de los numeros para despu�s dividirlos osease 0=0+<Numero
										// a introducir>= a ese num
			cantidadNum++;
			positivo = sc.nextDouble();
		}

		System.out.println("Tu media es: " + media / cantidadNum);
	}
}