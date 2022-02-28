package T1Ej4;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW
T1EJ4 - Pedir al usuario su edad, y mostrar la que tendrá el próximo año. 
 */

public class T1Ej4 {
public static void main(String[] arg) {
{
	byte ed;
	System.out.println("Introduce tu edad");
	Scanner num = new Scanner(System.in);
	ed = num.nextByte();
	ed++;						// otras variables de esta linea son, ed = (byte) (ed + 1)  o  ed= ed+1
	
	System.out.println(ed);
		
		}
	}
}
