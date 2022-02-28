package T1Ej21;

import java.util.Scanner;

/**
 * T1EJ21 - Nicolas Mihail Alexandru 1� DAW Un bi�logo est� interesado en
 * calcular el n�mero total de patas de los animales que ha capturado. Para
 * ello, debes escribir una aplicaci�n que le solicite: - N�mero de hormigas
 * capturadas (6 patas) - N�mero de ara�as capturadas (8 patas) - N�mero de
 * cochinillas capturadas (14 patas) El programa debe mostrar el n�mero de patas
 * totales de los animales capturados.
 * 
 */
public class T1Ej21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero de hormigas capturadas: ");
		int hormigas = sc.nextInt();
		System.out.println("Introduce el numero de ara�as capturadas: ");
		int aranyas = sc.nextInt();
		System.out.println("Introduce el numero de cochinillas capturadas: ");
		int cochinillas = sc.nextInt();

		int total = (hormigas * 6) + (aranyas * 8) + (cochinillas * 14);
		System.out.println("El numero total de patas de animales capturados es: " + total);
	}
}
