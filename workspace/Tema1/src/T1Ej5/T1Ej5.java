package T1Ej5;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW
T1EJ5 - Pedir al usuario su edad y mostrar cu�ntos a�os quedan para que cumpla 18
a�os.
 */

public class T1Ej5 {
public static void main(String[] arg) {
	byte edad;
	System.out.println("Introduce tu edad");
	Scanner num = new Scanner(System.in);
	edad = num.nextByte();
	int mayor = 18;					//Variable usada para calcular los a�os que faltan hasta 18
	System.out.println(mayor-edad);


	}
}
