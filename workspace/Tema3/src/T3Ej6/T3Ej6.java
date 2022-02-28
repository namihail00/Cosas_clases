package T3Ej6;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW T3Ej6 - Vamos a dise�ar el juego del �n�mero
 * secreto�. Habr� dos usuarios del programa: usuario1 y usuario2. El programa
 * pedir� al usuario1 un n�mero del 1 al 100, este n�mero ser� el n�mero
 * �secreto�. Posteriormente, el programa solicitar� al usuario2 un n�mero hasta
 * que encuentre el n�mero secreto o se rinda (introduzca el n�mero -1). Cada
 * vez que el usuario2 introduzca un n�mero, el programa le dir� �mayor� o
 * �menor� seg�n sea mayor o menor respecto al n�mero secreto. Cuando se
 * descubra el n�mero secreto se mostrar� el mensaje: �Felicidades! Has
 * encontrado el numero en N intentos�. Donde N ser� el n�mero de intentos que
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
			System.out.println("Felicidades has encontrado el n�mero secreto en >"+intentos+"< intentos");	
			break;
			}
			
		}

	}

}
