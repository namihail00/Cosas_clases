package Examen;

import java.util.Random;
import java.util.Scanner;

public class Examen {
	public static void main(String[] args) {
//		System.out.println(transformarString("321abc","a1"));	

		/*
		 * EJERCICIO3 REALIZA UN PROGRAMA QUE SOLICITE AL USUARIO UN NUMERO N. DICHO
		 * PROGRAMA DEBERA MOSTRAR LO SIGUIENTE:
		 * 
		 * 1. SI N TERMINA EN 0
		 * 2. LA RAIZ CUADRADA DE N
		 * 3. N AL CUADRADO
		 * 4. N/R = X
		 * 5. N/PI=Y
		 */
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero N :"); // SE PIDE "N"
		double N = sc.nextDouble();
		boolean acabaEnCero = true;
		if (N % 10 == 0) { // CONDICION PARA DETERMINAR SI EL NUMERO ACABA EN 0 O NO
			acabaEnCero = true;
		} else {
			acabaEnCero = false;
		}
		System.out.println("Acaba en cero?: " + acabaEnCero); // SI ACABA EN 0
		System.out.println("Raiz cuadrada de N: " + Math.sqrt(N)); // RAIZ CUADRADA
		System.out.println("Cuadrado de N " + N * N); // CUADRADO
		double R = (Math.random() * 100) % N; // NUM RANDOM + SU RANGO
		System.out.println((int) N + "/" + R + "=" + N / R); // N/R
		System.out.println("N Divididor entre PI: " + N / Math.PI); // DIVIDIR N SIN PONER PI A MANO
		
		
		
		
		/*
		 * EJERCICIO 4 REALIZA UN PROGRAMA QUE SOLICITE AL USUARIO 6 NUMEROS POSITIVOS
		 * DEL 1 AL 10. SI EL USUARIO NO INTRODUCE UN NUMERO DENTRO DE DICHO RANGO, EL
		 * PROGRAMA DEBERA SOLICITARLE OTRAVEZ EL NUMERO
		 * 
		 * 1.MOSTRAR LA SUMA TOTAL DE LOS NUMEROS
		 * 2.VER NUMERO DE APROBADOS (MAYORES O IGUALES A 5)
		 * 3.MOSTRAR MEDIA APROBADOS
		 */
		
		
		int sumaTotal = 0; // SUMA DE TODAS LAS NOTAS
		int sumaAprob = 0; // SUMA DE LOS APROBADOS, PARA LA MEDIA
		int contAprob = 0; // CONTADOR DE APROBADOS

		for (int i = 0; i < 6; i++) {
			int x = 6 - i;
			System.out.println("INTRODUCE " + x + " NOTAS: ");
			int nota = sc.nextInt();

			if (nota <= 0 || nota > 10) {
				System.out.println("Numero Introducido es menor que 1 o esta por encima de 10:");
				System.out.println("Introduce una nota correcta: ");
				nota = sc.nextInt();
			}

			sumaTotal += nota; // += ASI ME AHORRO PONER SUMA = SUMA + NOTA
			if (nota >= 5) {
				sumaAprob += nota;
				contAprob++;
			}

		}
		System.out.println("La suma de todas las notas es :" + sumaTotal);
		System.out.println("Numero de aprobados :" + contAprob);
		if (contAprob >= 1) {
			System.out.println("La media de los aprobados es :" + (double) sumaAprob / (double) contAprob);
		} else {
			System.out.println("No ha aprobado ningun alunno, no se puede hacer media");
		}
	}

	/*
	 * EJERCICIO1 DESAROLLA UN PROGRAMA QUE POR LO MENOS CONTEGA UNA FUNCION QUE
	 * RECIBA COMO PARAMETROS DE ENTRADA 2 STRINGS. LA FUNCION DEVOLVERA LA PRIMERA
	 * STRING TRANFORMANDO TODOS LOS CARACTERES QUE NO APAREZCAN EN LA SEGUNDA POR
	 * "+"
	 */
	// SIN ACABAR ME HE LIADO Y NO ENCONTRABA LA FORMA DE HACERLO
	public static String transformarString(String a, String buscador) {

		String fin = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == buscador.charAt(i)) {
				fin = fin + buscador.charAt(i);
			} else {
				fin = fin + buscador.replace(buscador.charAt(i), '+');
			}
		}
//		a.charAt(i)	== buscador.charAt(i);
//		fin =a.compareToIgnoreCase(buscador);
		return fin;
	}

}
