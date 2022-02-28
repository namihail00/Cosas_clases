package T1Ej20;

import java.util.Scanner;
/**
 * Nicolas Mihail Alexandru 1º DAW
 T1EJ20 - Escribe un programa que solicite al usuario una cantidad de segundos. El
programa mostrará cuántas horas, minutos y segundos hay en el número de segundos
introducidos. 
 */
public class T1Ej20 {
public static void main(String[] args) {
	
	Scanner asd = new Scanner(System.in);
	System.out.println("Introduce los segundos: ");
	int num = asd.nextInt();
	
	int horas = num/3600;
	int minutos = (num%3600)/60;
	int segundos = num%60;
	
	System.out.println(horas);
	System.out.println(minutos);
	System.out.println(segundos);
}

}
