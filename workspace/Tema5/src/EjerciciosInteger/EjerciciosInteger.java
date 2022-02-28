package EjerciciosInteger;

public class EjerciciosInteger {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		char ch = 'c';
		char ch2 = 'X';
		char ch55 = 72;
		String x = "33";

		string2Integer(x);
		mayorEntero	(e,b);
	}

	/*
	 * • Crea una función string2Integer que dado un entero como String, devolverá
	 * un entero de tipo Integer.
	 */

	public static void string2Integer(String x) {

		System.out.println(Integer.valueOf(x));

	}

	/*
	 * • Crea una función mayorEntero que pasando como arguments dos enteros,
	 * devolverá el mayor de los dos (utiliza la función correspondiente de
	 * Integer).
	 */
	public static void mayorEntero(int e, int b){

		System.out.println(Integer.max(e, b));

	}
}
