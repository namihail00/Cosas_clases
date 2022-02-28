package Teoria;

import java.util.Scanner;

public class Teoria {
	public static void main(String[] args) {
		String word = "";
//		System.out.println(factores(5));
//		System.out.println(nPrimerosSuma(90));
//		System.out.println(numInvertido(12));
//		System.out.println(sumaDig(58));
//		System.out.println(fibonacci(9));
//		imprimirNACero(5);
//		System.out.println(sumaCero(7, 0));
//		System.out.println(nDigitos(300, 0));
//		System.out.println(invertirPalabra("123",""));
//		System.out.println(sumaCero2(10));
		System.out.println(binarioGenerador(120));
//		asd(120);
		

	}
//	public static void asd(int num) {		??? npi
//		
//		    if (num > 0) {
//		    	System.out.print(num % 2);
//		        asd(num /2);
//		        
//		    }
//		}
	

	public static long fibonacci(long a) {
//		int b=1;
		if (a == 1 || a == 0) {

			return a;
		} else {

			return fibonacci(a - 1) + fibonacci(a - 2);

		}

	}

	public static int pow(int x, int n) {

		if (n == 1) {
			return x;

		} else {

			return x * pow(x, n - 1);
		}

	}

	public static int factores(int n) {

		if (n == 0) {

			return 1;
		} else {
			return n * factores(n - 1);
		}

	}

	public static int nPrimerosSuma(int n) {

		if (n == 0) {

			return 0;
		} else {
			return n + nPrimerosSuma(n - 1);
		}
	}

	public static int numInvertido(int n) {

		if (n / 10 == 0) {

			return n;
		} else {

			return (n % 10) * 10 + numInvertido(n / 10); // 123
		}
	}

	public static int sumaDig(int a) {

		if (a <= 10) {

			return a;
		} else {
			return a / 10 + sumaDig(a % 10);
		}

	}

	public static int sumaCero(int a, int b) {
		Scanner sc = new Scanner(System.in);

		if (a == 0) {

			return b;

		} else {
			System.out.println("Introduce un numero:");
			return sumaCero(sc.nextInt(), b + a);
		}

	}

	public static int sumaCero2(int a) {
		Scanner sc = new Scanner(System.in);
		int b;
		System.out.println("Introduce un numero:");
		b = sc.nextInt();
		a += b;
		if (a == 0) {

			return a;

		} else {

			return sumaCero2(a);
		}

	}

	public static void imprimirNACero(int a) {

		if (a == 0) {
			System.out.println(a);
		} else {
			System.out.println(a);
			imprimirNACero(a - 1);
		}

	}

	public static int nDigitos(int a, int b) {

		if (a == 0) {
			return b;
		} else {
			return nDigitos(a / 10, b + 1);

		}

	}

	public static int binarioGenerador(int entero) {
		int binario;
		if (entero == 0) {
			return binario = 0;
		} else {

			return binario = entero % 2 + 10 * (binarioGenerador(entero/2));
		}

	}

	public static int binario(int a) {

		if (a == 0) {
			return 1;
		} else {
			return 1;
		}

	}

//public static int invertirPalabra(int a) {
//		
//		if (a==1) {
//
//			return a;
//		} else {
//			
//			//a = a.substring(0, a.length()-1);
//			a=a+a;
//			a= a+a;
//			return invertirPalabra();
//
//		}
//
//	}

	// 1, 1, 2, 3, 5, 8, 13, 21, 34
//	public static int fibonacci(int a) {
//		int b=1;
//		if (a == 1) {
//
//			return a;
//		} else {
//			
////			b = a + a;
////			a = a + b;
//			return b = a +fibonacci(a = a +b);
//
//		}
//
//	}

}
