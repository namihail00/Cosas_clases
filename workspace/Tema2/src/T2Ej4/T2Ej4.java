package T2Ej4;

import java.util.Scanner;

/** T2EJ4 - Nicolas Mihail Alexandru 1� DAW
 * 
 * Solicitar al usuario dos n�meros diferentes y mostrar por pantalla aquel que sea
mayor.  */

public class T2Ej4 {
public static void main(String[] args) {
	
	
	Scanner tecld = new Scanner(System.in);
	System.out.println("Introduce un dos n�meros: ");
	
	int num1 = tecld.nextInt();
	int num2 = tecld.nextInt();
	
	
	
	if(num1 > num2) {
		System.out.println("El numero mas grande es "+num1);	
	
	}
	
	else {
		
		System.out.println("El numero mas grande es "+num2);
		}
	}
}
