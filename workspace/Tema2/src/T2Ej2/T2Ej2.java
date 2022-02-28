package T2Ej2;

import java.util.Scanner;

/** -  Nicolas Mihail Alexandru 1º DAW
 * 
 * T2EJ2 Escribe un programa que pida al usuario dos números enteros y que devuelva
verdadero si son iguales o alguno de ellos es positivo, y falso en caso contrario.  */

public class T2Ej2 {
public static void main(String[] args) {
	int num1;
	int num2 = 0;
	Scanner tecld = new Scanner(System.in);
	
	System.out.println("Introduce 2 numero verdaderos: ");
	num1 = tecld.nextInt();
	
	num2 = tecld.nextInt();
	
	System.out.println(num1 > 0 && (num1 > 0 || num1==num2));	
	}
	
	
}

//En la función basicamente mientras la primera variable sea positiva (num1) siempre será true.