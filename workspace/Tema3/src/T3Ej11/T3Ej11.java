package T3Ej11;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T3Ej11 - Escribe un programa que solicite al
 * usuario 5 calificaciones, y al final diga si alguna de ellas es suspenso o no
 * (menor de un 5)
 */

public class T3Ej11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador = 1;
		int nota = 0;
		int suspenso = 0;

		System.out.println("Introduzca 5 notas: ");
		while (contador <= 5) {

			nota = sc.nextInt();

			if (nota < 5) {
				suspenso = nota;
			}
			contador++;
		}
		if (suspenso != 0) {
			System.out.println("Hay algun suspenso");
		}
		if (suspenso == 0) {
			System.out.println("No hay ningun suspenso!");
		}
	}
}
