package AceptaElReto;

import java.util.Scanner;

public class Gregorio_XIII {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean done=false;
		int c=0;
		while(c<a) {
			int year = sc.nextInt();
				if (year % 100 == 0 && year % 400 != 0) {
					System.out.println(28);
				} else if (year % 100 == 0 && year % 400 == 0) {
					System.out.println(29);
				} else if (year % 4 == 0 && year % 100 != 0) {
					System.out.println(29);
				} else System.out.println(28);
				
			
			c++;
		}
		for (int i = 0; i < a; i++) {
			int year = sc.nextInt();
			
				if (year % 100 == 0 && year % 400 != 0) {
					System.out.println(28);
				} else if (year % 100 == 0 && year % 400 == 0) {
					System.out.println(29);
				} else if (year % 4 == 0 && year % 100 != 0) {
					System.out.println(29);
				} else System.out.println(28);

			
		}

	}
}
