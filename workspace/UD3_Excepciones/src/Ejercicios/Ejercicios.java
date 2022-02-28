package Ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {
	public static void main(String[] args) {
		
		
		
		System.out.println((Double.isNaN(4)));
	}

		
		/**
		 * Ejercicio 1. Tomar cuatro números enteros por teclado y mostrarlos al
		 * terminar la ejecución. En el caso de no introducir un número entero, se
		 * deberá mostrar un mensaje diciendo que el valor no es válido y pedirá otra
		 * vez los números desde el inicio
		 **/
//		Integer i = 0;
//		Integer num1 = 0;
//		Integer num2 = 0;
//		Integer num3 = 0;
//		Integer num4 = 0;
//
//		Boolean nocatch = true;
//		while (nocatch) {
//
//			try {
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Introduce 4 numeros: ");
//				num1 = sc.nextInt();
//				num2 = sc.nextInt();
//				num3 = sc.nextInt();
//				num4 = sc.nextInt();
//				nocatch = false;
//			} catch (InputMismatchException e) {
//				System.err.println("Error de formato");
//				System.err.println(e);
//
//			}
//			System.out.println(num1 + num2 + num3 + num4);
//		}
//	}

	/**
	 * Ejercicio 2. Repetir el ejercicio anterior, pero únicamente se volverá a
	 * pedir aquel número que no se ha introducido correctamente. Evita código
	 * duplicado.
	 **/

	/**
	 Ejercicio 3. Programa que lee dos números de tipo int, un String y dos de tipo double. Finalmente los mostrará por
	pantalla. Al introducir un tipo de dato que no es correcto, el mensaje de error deberá decir que tipo de dato hay que
	introducir.  
	 **/

		
		
		
	public static void errorVariable(int a, int b, String ab, double c, double d) {
		
		if(a < Integer.MIN_VALUE || a > Integer.MAX_VALUE) {
			
		}
		if(b < Integer.MIN_VALUE || b > Integer.MAX_VALUE) {
			
		}
		
		if(ab.isEmpty()) {
			
		}
		if(Double.isNaN(c)) {
			
		}
		
	
}
}
