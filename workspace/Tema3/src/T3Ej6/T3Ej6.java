package T3Ej6;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1º DAW T3Ej6 - Vamos a diseñar el juego del “número
 * secreto”. Habrá dos usuarios del programa: usuario1 y usuario2. El programa
 * pedirá al usuario1 un número del 1 al 100, este número será el número
 * “secreto”. Posteriormente, el programa solicitará al usuario2 un número hasta
 * que encuentre el número secreto o se rinda (introduzca el número -1). Cada
 * vez que el usuario2 introduzca un número, el programa le dirá “mayor” o
 * “menor” según sea mayor o menor respecto al número secreto. Cuando se
 * descubra el número secreto se mostrará el mensaje: “Felicidades! Has
 * encontrado el numero en N intentos”. Donde N será el número de intentos que
 * usuario2 ha hecho.
 */
public class T3Ej6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Usuario 1 introduce un numero entre 1 y 100");
		int usuario1 = sc.nextInt();
		int usuario2= 0;
		int intentos = 0;

		while (usuario1 >= 1 && usuario1 <= 100 && usuario2 != -1) {
			System.out.println("Usuario 2 introduce un numero entre 1 y 100");
			usuario2 = sc.nextInt();
			if (usuario1 < usuario2) {
				System.out.println("Menor");
			}
			if (usuario1 > usuario2) {
				System.out.println("Mayor");
			}
			
			intentos++; //intentos antes por si introduce el correcto ya le haya contado el intento.
			
			if (usuario1 == usuario2) {			//== para igualar variables == == == == == == == == == == == == == == == 
			System.out.println("Felicidades has encontrado el número secreto en >"+intentos+"< intentos");	
			break;
			}
			
		}

	}

}
