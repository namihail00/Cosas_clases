package T2Ej3;

import java.util.Scanner;

/** T2EJ3 -	Nicolas Mihail Alexandru 1º DAW
 * 
 *  Escribe un programa por consola que solicite al usuario un número y que muestre
por consola “par” si dicho número es par e “impar” si el número es impar. */

public class T2Ej3 {
public static void main(String[] args) {
	
	
	int num1;
	Scanner tecld = new Scanner(System.in);
	
	System.out.println("Introduce un número par o impar: ");
	num1 = tecld.nextInt();
	
	if (num1%2==0) {
		System.out.println("Tu Número es par!");
		
	}
	else {
		System.out.println("Tu Número es impar!");
	}

	
}



}
