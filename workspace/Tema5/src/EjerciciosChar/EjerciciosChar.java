package EjerciciosChar;

public class EjerciciosChar {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		char ch = 'c';
		char ch2 = 'X';
		char ch55 = 72;
		char ch71 = 'o';
		caracteristicaCaracter(a, b, c, d, e);
		convertirCharacter(ch);
		anteriorCharacter(ch2, ch);
		caracter2Integer(ch55);
	}

	/**
	 * � Crea una funci�n llamada caracteristicaCaracter que dado un car�cter por
	 * par�metro devuelva: o 1 si es un d�gito. o 2 si es una letra min�scula. o 3
	 * si es una letra may�scula. o 4 si es un espacio en blanco. o 5 si es un
	 * car�cter que no es alfanum�rico.
	 * 
	 */
	public static void caracteristicaCaracter(int a, int b, int c, int d, int e) {
		boolean aa = true;
		boolean bb = true;
		boolean cc = true;
		boolean dd = true;
		boolean ee = true;
		if (Character.isDigit(a)) { // CORREGIR Y PONER ELSE EN VEZ DE IF'S
			aa = true; // CORREGIR Y PONER ELSE EN VEZ DE IF'S
		} else { // CORREGIR Y PONER ELSE EN VEZ DE IF'S
					// CORREGIR Y PONER ELSE EN VEZ DE IF'S
			aa = false; // CORREGIR Y PONER ELSE EN VEZ DE IF'S
		} // CORREGIR Y PONER ELSE EN VEZ DE IF'S

		if (Character.isLowerCase(b)) {
			bb = true;
		} else {

			bb = false;
		}

		if (Character.isUpperCase(c)) {
			cc = true;
		} else {

			cc = false;
		}

		if (Character.isSpaceChar(d)) {
			dd = true;
		} else {
			dd = false;
		}

		if (Character.isAlphabetic(e)) {
			ee = false;
		} else {
			ee = true;
		}

		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);
		System.out.println(ee);
	}

	/*
	 * � Crea una funci�n llamada convertirCaracter que dado un car�cter de tipo
	 * letra lo convierta en may�scula si es min�scula y en min�scula si es
	 * may�scula.
	 */
	public static void convertirCharacter(char ch) {
		if (Character.isUpperCase(ch)) {
			System.out.println(Character.toLowerCase(ch));
		} else {
			Character.isLowerCase(ch);
			System.out.println(Character.toUpperCase(ch));
		}

	}

	/*
	 * � Crea una funci�n llamada anteriorCaracter que dados dos caracteres
	 * cualesquiera, devuelva cu�l es el menor independientemente de si es may�scula
	 * o min�scula.
	 */

	public static void anteriorCharacter(char ch, char ch2) { // en el caso de los 2 numeros que he puesto el primero es
																// 11 "puestos" mayor

		System.out.println(Character.compare(ch2, ch));
	}

	/*
	 * � Crea una funci�n llamada caracter2Integer que dado un entero como
	 * Character, devuelva el mismo entero de tipo Integer.
	 */

	public static void caracter2Integer(char ch71) {
		System.out.println(Character.getNumericValue(ch71));
	}
}
