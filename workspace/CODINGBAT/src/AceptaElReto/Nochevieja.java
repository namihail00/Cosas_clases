package AceptaElReto;

import java.util.Scanner;

public class Nochevieja {

	public static void main(String[] args) {
		String hora = "";
		Integer hInt = 0;
		Integer minInt = 0;
		while (!hora.equals("00:00")) {
			Scanner sc = new Scanner(System.in);
			
//			System.out.println("Introduce hora");
			
			hora = sc.nextLine();
			
			hInt = Integer.valueOf(hora.substring(0, 2));
			
			minInt = Integer.valueOf(hora.substring(3, 5));

			minInt = minInt + (hInt * 60);
			System.out.println(1440 - minInt);
		}

	}
}
