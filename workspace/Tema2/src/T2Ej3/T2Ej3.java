package T2Ej3;

import java.util.Scanner;

/** T2EJ3 -	Nicolas Mihail Alexandru 1� DAW
 * 
 *  Escribe un programa por consola que solicite al usuario un n�mero y que muestre
por consola �par� si dicho n�mero es par e �impar� si el n�mero es impar. */

public class T2Ej3 {
public static void main(String[] args) {
	
	
	int num1;
	Scanner tecld = new Scanner(System.in);
	
	System.out.println("Introduce un n�mero par o impar: ");
	num1 = tecld.nextInt();
	
	if (num1%2==0) {
		System.out.println("Tu N�mero es par!");
		
	}
	else {
		System.out.println("Tu N�mero es impar!");
	}

	
}



}
