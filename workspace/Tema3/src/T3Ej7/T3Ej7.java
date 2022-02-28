package T3Ej7;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW
 T3Ej7 - Escribe un programa que muestre los números múltiplos de X
comprendidos entre el 1 y N. Donde X y N son números introducidos por teclado por el
usuario de la aplicación. 
 * */

public class T3Ej7 {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	int x; //multiplos de
	int n=0; //determinante del final de rango del cual coger números
	int contador=1; // inicio del rango, empezara en el 1 en este caso
	
	
	System.out.println("Introduzca el rango, ira de 1 al numero que usted introduzca: ");
	n = sc.nextInt();  
	System.out.println("Introduzca el numero que quiera que sea un dividendo:  ");
	x = sc.nextInt();
	
	
	while(contador <= n) {				//mientras el numero del que se haga modulo no superer el rango el while sigue
		 
		if(contador % x==0) {			//si al dividir el número al que estamos en el rango nos da 0 sacarlo a consola, seria un multiplo
			System.out.println(contador);
		}
		
		
		contador++;						// es el numero al que le dividiremos la X sube y da resultado cada vez que el contador llegue a ser un multiplo del numero introducido
		}
	}
}

