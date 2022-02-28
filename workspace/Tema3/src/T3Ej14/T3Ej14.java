package T3Ej14;

/**
 Nicolas Mihail Alexandru 1º DAW
 T3Ej14 - Escribe un programa que solicite al usuario un número decimal y muestre
su representación binaria.
 * */

import java.util.Scanner;

public class T3Ej14 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int num=0;
	int binario=0;
	int contador=0;
	System.out.println("Introduzca un numero decimal para pasarlo a binario:");
	num = sc.nextInt();
	
	//for(int dividendo=num; num<2;contador++) {
		
	//	dividendo= num%2;
	//	num=num/2;
		
	//PSEUDOCODIGO BINARIO A DECIMAL	
		
	//}
	//	System.out.println(500%2);
	while(num !=0) {
		binario=num%2;
		System.out.print(binario);
		num=num/2;
		
		contador++;
		System.out.println(contador);
		}
	}
}
