package T1Ej6;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW
T1EJ6 - Pedir al usuario el a�o actual y el de nacimiento del usuario, y devolver su edad.
Suponiendo que en el a�o en curso el usuario ya ha cumplido a�os. 
 */


public class T1Ej6 {
	public static void main(String[] arg) {

		Scanner num = new Scanner(System.in);
		
		System.out.println("Introduzca a�o nacimiento");
		int anionac = num.nextInt();
		
		System.out.println("Introduzca a�o actual");
		int anioactual = num.nextInt();
	
		System.out.println("Su edad es");
		System.out.println(anioactual-anionac);

	}
		
}
