package T1Ej21;

import java.util.Scanner;

/**
 * T1EJ21 - Nicolas Mihail Alexandru 1º DAW Un biólogo está interesado en
 * calcular el número total de patas de los animales que ha capturado. Para
 * ello, debes escribir una aplicación que le solicite: - Número de hormigas
 * capturadas (6 patas) - Número de arañas capturadas (8 patas) - Número de
 * cochinillas capturadas (14 patas) El programa debe mostrar el número de patas
 * totales de los animales capturados.
 * 
 */
public class T1Ej21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el numero de hormigas capturadas: ");
		int hormigas = sc.nextInt();
		System.out.println("Introduce el numero de arañas capturadas: ");
		int aranyas = sc.nextInt();
		System.out.println("Introduce el numero de cochinillas capturadas: ");
		int cochinillas = sc.nextInt();

		int total = (hormigas * 6) + (aranyas * 8) + (cochinillas * 14);
		System.out.println("El numero total de patas de animales capturados es: " + total);
	}
}
