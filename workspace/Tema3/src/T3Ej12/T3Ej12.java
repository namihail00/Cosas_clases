package T3Ej12;

import java.util.Scanner;

/**
 Nicolas Mihail Alexandru 1º DAW
 T3Ej12 - Escribe un programa que solicite al usuario 10 calificaciones, y al final diga
el número de aprobados y el número de suspendidos (menor de un 5).

 * */

public class T3Ej12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int contadorAprob=0;
	int contadorSusp=0;
	int nota=0;
	
	System.out.println("Introduzca 10 calificaciones: ");
	
	for(int i=1; i<=10; i++){
		nota = sc.nextInt();
		
		if(nota < 5) {
			
			++contadorSusp;
			}
		contadorAprob++;
		}
	System.out.println("Total de aprobados: "+(contadorAprob-contadorSusp));
	System.out.println("Total de suspensos: "+contadorSusp);
	}
}
