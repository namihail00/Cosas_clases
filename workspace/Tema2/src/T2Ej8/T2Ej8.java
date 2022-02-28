package T2Ej8;

import java.util.Scanner;

/**
 * T2EJ7 - Nicolas Mihail Alexandru 1º DAW
 * 
 * Escribe un programa que solicite al usuario un número del 0 al 7 y
 * muestre el nombre del día de la semana. (0 es lunes, 1 es martes, …)
 */
public class T2Ej8 {
	public static void main(String[] args) {

		Scanner tecld = new Scanner(System.in);

		System.out.println("Introduce un numero de 0 a 6 y te dire el dia de la semana");
		int num = tecld.nextInt();

		switch (num) {
		case 0:
			System.out.println("Lunes");
			break;
		}
		switch (num) {
		case 1:
			System.out.println("Martes");
			break;
		}
		switch (num) {
		case 2:
			System.out.println("Miercoles");
			break;
		}
		switch (num) {
		case 3:
			System.out.println("Jueves");
			break;
		}
		switch (num) {
		case 4:
			System.out.println("Viernes");
			break;
		}
		switch (num) {
		case 5:
			System.out.println("Sabado");
			break;
		}
		switch (num) {
		case 6:
			System.out.println("Domingo");
			break;
		default:
		System.out.println("No es un numero valido");
		break;
		}
	}

}
