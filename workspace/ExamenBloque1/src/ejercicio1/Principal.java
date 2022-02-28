package ejercicio1;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		modulo();
	}

	public static void modulo() { // metodo para hacer el modulo de 2 numeros introducidos por cadena

		boolean fin = false; // booleano para indicar cuando se acaba el bucle
		while (fin != true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una cadena que sea: 'numero modulo numero'"); // se pide graficamente la
																						// cadena al usuario

			String a = sc.nextLine();

			String numero1 = a.substring(0, a.indexOf("modulo") - 1); // se extrae de la cadena el primer numero
			String numero2 = a.substring(a.indexOf("modulo") + "modulo".length() + 1); // se extrae el segundo numero de
																						// la cadena 

			double n = Double.valueOf(numero1); // pasamos los string a sus valores respectivos
			long m = Long.valueOf(numero2);

			if (n == 0 && m == 0) { // el programa termina si el usuario introduce 0 modulo 0
				fin = true;
			} else {
				System.out.println((long) n % m); // resultado por pantalla y pide otro numero
			}

		}

	}
}
