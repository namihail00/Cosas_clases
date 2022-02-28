package EjerciciosString;

public class EjerciciosString {
	public static void main(String[] args) {
		String a = "AZAZ ", b = "AZAZ ", c = "!!", d = "frase AleAAtoria si", e = "ASD aaa LKJS",
				subcad = "asdefghijklm";
		boolean x = true;
		int entrada = 1, fin = 6;

		System.out.println(compararCadenas(a, c));
		System.out.println(concatenar(a, b, c));
		deletrearCadena(a);
		System.out.println(toCamelCase(d));
		System.out.println(toCamelCase2(d, x));
		System.out.println(subcadena(subcad, entrada, fin));
	}

	/*
	 * • Crea la función compararCadenas que dadas dos cadenas por parámetro,
	 * devolverá verdadero en caso de que sean iguales o falso en caso contrario.
	 */

	public static boolean compararCadenas(String a, String b) {

		if (a.equalsIgnoreCase(b) == true) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * • Crea una función llamada concatenar que dadas tres cadenas, devuelva su
	 * concatenación.
	 */
	public static String concatenar(String a, String b, String c) {
		String ab = a.concat(b);
		String abc = ab.concat(c);
		return abc;
	}

	/*
	 * • Crea la función deletrearCadena que pasando una cadena por parámetro,
	 * muestre cada uno de sus caracteres por consola en una misma línea y separados
	 * por espacio.
	 * 
	 */
	public static void deletrearCadena(String a) {

		//
		for (int cont = 0; cont < a.length(); cont++) { // for que vaya desde la primera letra hasta la ultima y saque
														// la letra actual con un sys.out
			System.out.print(a.charAt(cont) + " "); // letra + espacio

		}

	}

	/*
	 * • Crea la función toCamelCase que pasando una cadena por parámetro, devuelva
	 * la misma cadena en formato CamelCase comenzando con minúscula.
	 */

	public static String toCamelCase(String a) {

		// creo la string char por char, casteando todos los char y hacer upper case y
		// lower case cuando sea necesario
//		String finCC = String.valueOf(a.charAt(0)).toLowerCase() + String.valueOf(a.charAt(1))					
//				+ String.valueOf(a.charAt(2)) + String.valueOf(a.charAt(3)) + String.valueOf(a.charAt(4))
//				+ String.valueOf(a.charAt(5)).toUpperCase() + String.valueOf(a.charAt(6)) + String.valueOf(a.charAt(7))
//				+ String.valueOf(a.charAt(8));
//		---------------------------------------------------------------------------------------------------------------------
//		char CC = a.charAt(0);
//		char CC2 = a.charAt(5);
//		String CC =	String.valueOf(a.charAt(0));	
//		String CC2 = String.valueOf(a.charAt(5));
//		
//		CC=CC.toLowerCase();
//		CC2=CC2.toUpperCase();
//		String finCC = a.replaceFirst(CC, a);
//		---------------------------------------------------------------------------------------------------------------------
		a = a.toLowerCase();
		String finCC = "";
		for (int cont = 0; cont < a.length(); cont++) {

			if (a.charAt(cont) == ' ') {
				finCC = finCC + Character.toUpperCase(a.charAt(cont + 1));
				cont++;
			} else {
				finCC = finCC + a.charAt(cont);
			}
		}

		return finCC;
	}

	/*
	 * • Crea la función toCamelCase que reciba dos parámetros, el primer carácter
	 * será la cadena que transformaremos a camel case y el segundo parámetro será
	 * un Boolean que si es verdadero hará que la función devuelva la cadena en
	 * camel case comenzando en minúscula, y si es falso comenzando en mayúscula.
	 */

	public static String toCamelCase2(String a, boolean x) {
		// true = minuscula , false = mayuscula
		// boolean zz = x;
		String finCC = "";

		if (x == true) {
			a = a.toLowerCase();
			for (int cont = 0; cont < a.length(); cont++) {

				if (a.charAt(cont) == ' ') {
					finCC = finCC + Character.toUpperCase(a.charAt(cont + 1));
					cont++;
				} else {
					finCC = finCC + a.charAt(cont);
				}
			}
		} else {
//		if(zz == false) {
			a = a.toLowerCase();
			for (int cont = 1; cont < a.length(); cont++) {
				if (cont - 1 == 0) {
					finCC = finCC + Character.toUpperCase(a.charAt(0));
				}
				if (a.charAt(cont) == ' ') {
					finCC = finCC + Character.toUpperCase(a.charAt(cont + 1));
					cont++;
				} else {
					finCC = finCC + a.charAt(cont);
				}
			}
		}

		return finCC;
	}

	/*
	 * Crea la función subcadena que reciba tres parámetros. Primero, la cadena de
	 * la que vamos a obtener la subcadena. Segundo, el índice de inicio (comenzando
	 * por 1) desde donde voy a tomar la subcadena. Tercero, el índice del final
	 * donde voy a cortar la subcadena. Debe devolver la subcadena que vaya de la
	 * posición inicial a la final que indican los parámetros.
	 */
	public static String subcadena(String c, int entrada, int fin) {
		String d = c.substring(entrada, fin);
		return d;
	}

	/*
	 * Crea una función llamada esMayor que reciba por parámetro dos cadenas, y
	 * devuelva aquella que tiene más caracteres.
	 */
	
	public static void esMayor(String a, String b) {
		//usar compareTo
		
	}
}