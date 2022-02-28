package Matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrices {
	public static void main(String[] args) {

		String matriz[][] = new String[2][30];

		matriz[0][2] = "Nico";

//		ej1();

//		ej2();

//		ej3();

		ej4();

		/*
		 * ej1 Crear una matriz de 3×3 con los números del 1 al 9. Mostrar por pantalla,
		 * tal como aparece en la matriz.
		 */
	}

	public static void ej1() {

		byte matriz[][] = new byte[3][3];
		byte n = 1;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = n;
				n++;
			}

		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println();
		}

	}

	public static void mostrar(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println();
		}
	}

	/*
	 * ej2 . Crea una matriz de 5 filas y n columnas (pídeselo al usuario). Rellena
	 * dicha matriz con números aleatorios del 0 al 10 (incluidos).
	 */

	public static void ej2() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("Introducir n columnas");
		int nColumnas = sc.nextInt();

		int matriz[][] = new int[5][nColumnas];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = r.nextInt(11);

			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + "\t");

			}
			System.out.println();
		}
	}

	/*
	 * 3. Crea una tabla bidimensional de 5x5 y rellénala de la siguiente forma: el
	 * elemento de la posición [n][m] debe contener el valor 10*n+m. Después debes
	 * mostrar su contenido.
	 */

	public static void ej3() {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[5][5];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = 10 * (i + j);
			}
		}

	}

	/*
	 * Crea una matriz 4x4 de enteros que inicialmente esté vacía, a continuación
	 * muestra un menú con las siguientes opciones: • Rellenar toda la matriz con
	 * números, pidiéndoselos al usuario. • Devolver la suma de una fila (pedir al
	 * usuario el número de fila) • Devolver la suma de una columna (pedir al
	 * usuario el número de columna) • Sumar la diagonal principal (posición 00 a
	 * 33) • Sumar la diagonal inversa (posición 30 a 03) • Salir
	 */

	public static void ej4() {
		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[4][4];
		int opc;

		do {
			menu();
			System.out.println("Introduce una opcion");
			opc = sc.nextInt();

			switch (opc) {
			case 1:
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						System.out.println("Introduzca el numero de la casilla [" + i + "] [" + j + "]");
						matriz[i][j] = sc.nextInt();
					}
				}
				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz.length; j++) {
						System.out.print(matriz[i][j] + "\t");

					}
					System.out.println();
				}

				break;

			case 2:
				int sumaF = 0;
				System.out.println("Introduce la fila a sumar");
				int fila = sc.nextInt();

				for (int j = 0; j < matriz.length; j++) {
					sumaF = sumaF + matriz[fila][j];
				}
				System.out.println("Suma de filas es :" + sumaF);

				break;

			case 3:
				int sumaC = 0;
				System.out.println("Introduce la fila a sumar");
				int colum = sc.nextInt();

				for (int i = 0; i < matriz.length; i++) {
					sumaC = sumaC + matriz[i][colum];
				}
				System.out.println("Suma de columnas es :" + sumaC);

				break;

			case 4:
				break;
			case 5:
				break;
			case 6:
				opc=6;
				break;
			default:
				System.out.println("Introduzca una opcion valida");
				break;
			}
		} while (opc != 6);

	}

	public static void menu() {

		

	}
}
