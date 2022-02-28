package T1Ej6;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW
T1EJ6 - Pedir al usuario el año actual y el de nacimiento del usuario, y devolver su edad.
Suponiendo que en el año en curso el usuario ya ha cumplido años. 
 */


public class T1Ej6 {
	public static void main(String[] arg) {

		Scanner num = new Scanner(System.in);
		
		System.out.println("Introduzca año nacimiento");
		int anionac = num.nextInt();
		
		System.out.println("Introduzca año actual");
		int anioactual = num.nextInt();
	
		System.out.println("Su edad es");
		System.out.println(anioactual-anionac);

	}
		
}
