package T1Ej3;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW
T1Ej3 - Escribir un programa que pida al usuario un n�mero y responda �Has introducido
el n�mero N�, donde N es el n�mero introducido por el usuario. 
 */

public class T1Ej3 {

public static void main(String[] args) {
	int n; {
		System.out.println("Introduce un numero");
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		System.out.println("Tu numero es"+n);	//Hay 2 systems.out debido a que al principio lo hice sin +n en el primer print
		System.out.println(n);
	}
	
	
	}

}
