package T1Ej18;

/**
Nicolas Mihail Alexandru 1º DAW 
T1EJ18 - Escribe un programa que solicite las notas del primer, segundo y tercer
trimestre. El programa debe mostrar la nota media del curso sin decimales, sin
redondear, a través del truncamiento. 

*/

import java.util.Scanner;

public class T1Ej18 {
	public static void main(String[] args) {

		Scanner tecld = new Scanner(System.in);

		System.out.println("Introduce nota primer trimestre: ");
		double nota1 = tecld.nextDouble();

		System.out.println("Introduce nota segundo trimestre: ");
		double nota2 = tecld.nextDouble();

		System.out.println("Introduce nota tercer trimestre: ");
		double nota3 = tecld.nextDouble();

		int notafinal = (int) (nota1 + nota2 + nota3) / 3;
		System.out.println("Tu nota final es: " + notafinal);
		// Nota media sería 7,77 sin truncar
	}
}
