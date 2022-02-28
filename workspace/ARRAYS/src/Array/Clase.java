package Array;

import java.util.Random;
import java.util.Scanner;

public class Clase {
	public static void main(String[] args) {
//		ejercicio5();
//		ejercicio6();
		numeros10();
	}

	public static void ejercicio4() {

		String[] arrayStrings = new String[5];
		int indicadorArrayStrings = 0;

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < 6; i++) {
			System.out.println("Introduce cadena: ");
			arrayStrings[i] = s.nextLine();
			indicadorArrayStrings++;
		}

		for (int i = 0; i < arrayStrings.length; i++) {
			System.out.print(arrayStrings[i] + " ");
		}

		arrayStrings[arrayStrings.length - 1] = null;
		indicadorArrayStrings--;

	}

	/*
	 * 5. Crea una Array de tipo String de tamanyo 1000. El programa solicitando
	 * Strings al usuario hasta que introduzca "para". Una vez introducido "para",
	 * se mostrarán todas las String introducidas anteriormente separadas mediante
	 * un espacio.
	 * 
	 */

	public static void ejercicio5() {
		Scanner s = new Scanner(System.in);
		String[] arrayStrings = new String[1000];
		int indicadorArrayStrings = 0;
		System.out.println("Metele strings: ");
		String entrada = s.nextLine();

		while (entrada.compareTo("para") != 0) {
			arrayStrings[indicadorArrayStrings] = entrada;
			indicadorArrayStrings++;

			entrada = s.nextLine();
		}

		for (int i = 0; i < indicadorArrayStrings; i++) {
			System.out.print(arrayStrings[i] + " ");
		}
	}

	/*
	 * 6. Crea un Array de tipo Integer de tamanyo 1000. El programa inicializara
	 * con un numero de componenetes aleatorio (menor que 999) con enteros
	 * aleatorios. al finalizar, se mostrara aquellos componenetes que ha
	 * inicializado.
	 * 
	 */

	public static void ejercicio6() {
		Random r = new Random();

		Integer[] arrayIntegers = new Integer[100000000];
		int indicadorArrayIntegers = r.nextInt(99999000);

		for (int i = 0; i <= indicadorArrayIntegers; i++) {

			arrayIntegers[i] = r.nextInt(indicadorArrayIntegers);
		}
		int cont = 0;
		for (int i = indicadorArrayIntegers; i >= 0; i--) {
			cont++;
			System.out.print(arrayIntegers[i] + " ");
			System.out.println("--" + cont + "--");
		}
	}

	/*
	 * Crea un programa que: 1-Pida al usuario un numeor entero que indicara el
	 * numero maximo de entero que s epodran almcenar.
	 * 
	 * 2-Cree un array con tantos componenetes como haya indicado le usuario
	 * 
	 * 3-Pida al usuario numero entero hasta que introduzca el 0
	 * 
	 * 4-Muestra la siguiente informacion:
	 * 
	 * a+Tamanio del array
	 * 
	 * b+Numero de elementos relevantes
	 * 
	 * c+Lista separada por un espacio de los elementos relevantes
	 * 
	 */

	/*
	 * Crea un array de longitud 10 que si inicializara con numeros aleatorios
	 * comprendidos entre 1 y 100. Muestra la suma de todos los numeros aleatorios
	 * almacenados
	 */
	
	public static void numeros10() {
		Random r = new Random();
		
		Integer suma=0;
		Integer[] arrayIntegers = new Integer [10];
		int indicadorArrayIntegers = 10;
		
		
		
		for (int i = 0; i < 10 ; i++) {
			
			arrayIntegers[i] = r.nextInt(100);
			
			suma = suma + arrayIntegers[i];
		}
		System.out.println("--"+suma+"--");
		
		
		Integer suma2=0;
		Integer[] arrayIntegers2 = new Integer [10];
		int indicadorArrayIntegers2 = 10;
		
		for (int i = 0; i < 10 ; i++) {
			
			arrayIntegers2[i] = r.nextInt(100);
			
			suma2 = suma2 + arrayIntegers2[i];
		}
		System.out.println("--"+suma2+"--");
		
		Integer suma3=0;
		Integer[] arrayIntegers3 = new Integer [10];
		int indicadorArrayIntegers3 = 10;
		
		for (int i = 0; i < 10 ; i++) {
			
			arrayIntegers3[i] = r.nextInt(100);
			
			suma3 = suma3 + arrayIntegers3[i];
		}
		System.out.println("--"+suma3+"--");
		
		Integer suma4=0;
		Integer[] arrayIntegers4 = new Integer [10];
		int indicadorArrayIntegers4 = 10;
		
		for (int i = 0; i < 10 ; i++) {
			
			arrayIntegers4[i] = r.nextInt(100);
			
			suma4 = suma4 + arrayIntegers4[i];
		}
		System.out.println("--"+suma4+"--");
		Integer suma5=0;
		Integer[] arrayIntegers5 = new Integer [10];
		int indicadorArrayIntegers5 = 10;
		
		for (int i = 0; i < 10 ; i++) {
			
			arrayIntegers5[i] = r.nextInt(100);
			
			suma5 = suma5 + arrayIntegers5[i];
		}
		System.out.println("--"+suma5+"--");
		
	}

}
