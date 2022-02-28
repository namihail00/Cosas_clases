package T1Ej5;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW
T1EJ5 - Pedir al usuario su edad y mostrar cuántos años quedan para que cumpla 18
años.
 */

public class T1Ej5 {
public static void main(String[] arg) {
	byte edad;
	System.out.println("Introduce tu edad");
	Scanner num = new Scanner(System.in);
	edad = num.nextByte();
	int mayor = 18;					//Variable usada para calcular los años que faltan hasta 18
	System.out.println(mayor-edad);


	}
}
