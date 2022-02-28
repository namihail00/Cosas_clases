package T3Ej13;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1ºDAW T3Ej13 - Escribe un programa que solicite al
 * usuario un número n y dibuje un triángulo rectángulo de n elementos de lado,
 * utilizando asteriscos (*).
 *
 */
public class T3Ej13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		System.out.println("Introduzca el largo de su triangulo rectangulo: ");
		n = sc.nextInt();
		
		for(int i=n; i>0; i--) {	// En este caso es voy de i=n ej 4, de 4 a 0, i>0 disminuyendo
						
			for(int z=i;z>0; z--) {		// Aqui igual print para escribir en la misma linea los *, después voy de z=1 (4) hasta z>0 (hasta que z sea menor que 0) osea 0, restando.
				System.out.print("*");	// Print normal para escribir los * en la linea
				 
			}
			System.out.println();		// Este println para introducir un salto de linea
		}	
	}
}
