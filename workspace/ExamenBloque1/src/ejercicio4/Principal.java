package ejercicio4;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println(multa());

	}

	public static boolean multa() {
		System.out.println("Introduce distancia, velocidad maxima y segundos");
		Scanner sc = new Scanner(System.in);
		double distancia = sc.nextInt();
		double velocidadMax = sc.nextInt();
		double segundos = sc.nextInt();

//		v = e/t

		double velCoche = (distancia / segundos) * 3.6;

		if (velCoche > velocidadMax) {
			return true;
		} else
			return false;

	}

}
