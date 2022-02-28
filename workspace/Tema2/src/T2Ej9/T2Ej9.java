package T2Ej9;

import java.util.Scanner;

/**
 * T2EJ9 - Nicolas Mihail Alexandru 1� DAW
 * 
 * Escribe un programa que calcule el dinero recaudado en un concierto.
 * La aplicaci�n solicitar� el aforo m�ximo del local, el precio por entrada
 * (todas tienen el mismo precio) y el n�mero de entradas vendidas. Hay que
 * tener en cuenta que si el n�mero de entradas vendidas no supera el 20% del
 * aforo, el concierto se suspender�.
 */
public class T2Ej9 {
	public static void main(String[] args) {

		Scanner tecld = new Scanner(System.in);

		System.out.println("Introduce el aforo max.:");
		double aforo = tecld.nextDouble();

		System.out.println("Introduce el coste por entrada:");
		double coste = tecld.nextDouble();

		System.out.println("Introduce cantidad de entradas vendidas:");
		double ventas = tecld.nextDouble();

		if (ventas > aforo * 0.2) {
			System.out.println("Este concierto ha recaudado " + coste * ventas + "�");
		} else {
			System.out.println("Este concierto es inviable");
		}
	}
}
