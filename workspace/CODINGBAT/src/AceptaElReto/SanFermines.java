package AceptaElReto;

import java.util.Scanner;

public class SanFermines {

	public static void main(String[] args) {
		int max = 0;
		int max2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce cantidad de toros");
		int Ntoros = sc.nextInt();

		for (int i = 0; i < Ntoros; i++) {
			System.out.println("Introduce vel toro");
			int vel = sc.nextInt();
			if (max < vel) {
				max=vel;

			}
			System.out.println(max);
		}
		System.out.println("Introduce cantidad de toros2");
		int Ntoros2 = sc.nextInt();
		for (int y = 0; y < Ntoros; y++) {
			System.out.println("Introduce vel toro");
			int vel2 = sc.nextInt();
			if (max2 < vel2) {
				max2 = vel2;
			}
			System.out.println(max2);

		}
	}

}
