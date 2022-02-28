package String1;

public class String1 {

	public static void main(String[] args) {

//		System.out.println(makeOutWord("nbnb", "ASD"));
//		System.out.println(firstHalf("123456"));
//		System.out.println(nonStart("ahotl", "java"));
//		System.out.println(left2("as7d"));
//		System.out.println(withoutEnd2("casa"));
//		System.out.println(nTwice("Hello", 2));
//		System.out.println(countHi("Hiasashiassahi"));
//		System.out.println(catDog("catlkjhgdogzlksdogzlkjcat"));
//		getSandwich("breadjambread");
		aa("XY123XY", "XY");
	}

	/**
	 * 1 [String-1 - makeOutWord] Define una función con dos parámetros de tipo
	 * String. El primer parámetro será una cadena de longitud 4, y el segundo
	 * parámetro será un String cualquiera. La función deberá devolver un nuevo
	 * String donde el segundo parámetro se encontrará en la mitad del primer
	 * parámetro.
	 * 
	 * makeOutWord("<<>>", "Yay") → "<<Yay>>" makeOutWord("<<>>", "WooHoo") →
	 * "<<WooHoo>>" makeOutWord("[[]]", "word") → "[[word]]"
	 * 
	 **/

	// Version coding bat.
	public static String makeOutWord(String a, String b) { // coding bat sin static
		return a.substring(0, 2) + b + a.substring(2);

	}

	/**
	 * 2 [String-1 - firstHalf ] Define una función que reciba un String. Dicha
	 * función devolverá la primera mitad de dicha String.
	 * 
	 * firstHalf("WooHoo") → "Woo" firstHalf("HelloThere") → "Hello"
	 * firstHalf("abcdef") → "abc"
	 * 
	 **/

	public static String firstHalf(String a) {

		return a.substring(0, a.length() / 2);

//		String halvedString = "";
//
//		for (int i = 0; i < (a.length()) / 2; i++) {
//			halvedString = halvedString + a.charAt(i);
//		}
//		return halvedString;

	}

	/**
	 * 3 [String-1 > nonStart] Define una función que reciba dos parámetros de
	 * entrada de tipo String. Dicha función deberá devolver su concatenación,
	 * eliminando el primer carácter de cada uno de los parámetros de entrada.
	 * 
	 * nonStart("Hello", "There") → "ellohere" nonStart("java", "code") → "avaode"
	 * nonStart("shotl", "java") → "hotlava"
	 * 
	 **/
	public static String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	/**
	 * 4 [String-1 > left2] Define una función que reciba por parámetro un String de
	 * por lo menos 2 caracteres. Dicha función devolverá otra String donde los dos
	 * primeros caracteres se habrán movido al final del String.
	 * 
	 * left2("Hello") → "lloHe" left2("java") → "vaja" left2("Hi") → "Hi"
	 **/
	public static String left2(String a) {
		if (a.length() >= 2) {
			return a.substring(2) + a.substring(0, 2);
		} else {
			return "";
		}

	}

	/**
	 * 5 [String-1 > theEnd] Define una función que reciba dos parámetros de
	 * entrada, un String y un Boolean. En caso de que el booleano sea verdadero,
	 * devolverá el primer caracter del String y en caso contrario devolverá el
	 * último carácter del String.
	 * 
	 * theEnd("Hello", true) → "H" theEnd("Hello", false) → "o" theEnd("oh", true) →
	 * "o"
	 * 
	 **/

	public static String theEnd(String a, boolean b) {
		if (b) {
			return a.substring(0, 1);
		} else {
			return a.substring(a.length() - 1);
		}
	}

	/**
	 * 6 [String-1 > withouEnd2] Define una función que reciba un parámetro de
	 * entrada, dicha función devolverá otra String eliminando el primer y último
	 * carácter. El String de entrada podrá tener cualquier tamaño.
	 * 
	 * withouEnd2("Hello") → "ell" withouEnd2("abc") → "b" withouEnd2("ab") → ""
	 * 
	 **/
	public static String withoutEnd2(String a) {

		if (a.length() == 0 || a.length() == 1) {
			return "";
		} else {
			return a.substring(1, a.length() - 1);
		}
	}

	/**
	 * 7 [String-1 > nTwice] Define una función que reciba dos parámetros, un String
	 * y un entero N. Dicha función devolverá otra String compuesta por los primeros
	 * N dígitos y los últimos N dígitos.
	 * 
	 * nTwice("Hello", 2) → "Helo" nTwice("Chocolate", 3) → "Choate"
	 * nTwice("Chocolate", 1) → "Ce"
	 * 
	 **/

	public static String nTwice(String a, int b) {
		return a.substring(0, b) + a.substring(a.length() - b);
	}

	/**
	 * 8 [String-2 > doubleChar] Define una función que reciba un parámetro de
	 * entrada de tipo String. La función devolverá otra String que contenga cada
	 * uno de los caracteres duplicados.
	 * 
	 * doubleChar("The") → "TThhee" doubleChar("AAbb") → "AAAAbbbb"
	 * doubleChar("Hi-There") → "HHii--TThheerree"
	 * 
	 **/

	public static String doubleChar(String a) {
		String doubC = "";
		for (int i = 0; i < a.length(); i++) {
			doubC = doubC + a.charAt(i) + a.charAt(i);
		}
		return doubC;
	}

	/**
	 * 9 [String-2 > countHi] Crea una función que reciba como parámetro un String.
	 * La función devolverá un entero que indica el número de veces que aparece la
	 * cadena “hi” dentro del parámetro de entrada.
	 * 
	 * countHi("abc hi ho") → 1 countHi("ABChi hi") → 2 countHi("hihi") → 2
	 * 
	 **/

	public static int countHi(String a) {
		int cont = 0;
		String test = "";
		for (int i = 0; i < a.length() - 1; i++) {
			test = a.substring(i, i + 2);
			if (test.equals("hi")) {
				cont++;
			}

		}
		return cont++;
	}

	/**
	 * 10 [String-2 > catDog] Define una función que reciba por parámetro un String.
	 * Devolverá verdadero en caso de que los Strings “cat” y “dog” aparezcan el
	 * mismo número de veces, y falso en caso contrario.
	 * 
	 * catDog("catdog") → true catDog("catcat") → false catDog("1cat1cadodog") →
	 * true
	 * 
	 **/
	public static boolean catDog(String a) {
		int cat = 0;
		int dog = 0;
		String test = "";
		for (int i = 0; i < a.length() - 2; i++) {
			test = a.substring(i, i + 3);
			if (test.equals("cat")) {
				cat++;
			}
			if (test.equals("dog")) {
				dog++;
			}
		}
		return dog == cat;
	}

	/**
	 * 11 [String-2 > countCode]Define una función que reciba por parámetro un
	 * String. Devolverá el número de veces que la palabra “code” aparece en dicho
	 * parámetro. Aceptaremos que la ‘d’ pueda ser sutituida por cualquier otra
	 * letra. Por lo que “cope” y “cooe” también contarán.
	 * 
	 * countCode("aaacodebbb") → 1 countCode("codexxcode") → 2
	 * countCode("cozexxcope") → 2
	 * 
	 **/

	public static int countCode(String a) {
		int codeCont = 0;
		if (a.length() <= 3) {
			return 0;
		} else {
			for (int i = 0; i < a.length() - 3; i++) {

				if (a.substring(i, i + 2).equals("co") && a.substring(i + 3, i + 4).equals("e")) {

					codeCont++;
				}

			}

			return codeCont;
		}
	}

	/**
	 * 12 [String-2 > getSandwich] Define una función que reciba por parámetro un
	 * String. Dicha función devolverá otra string con la cadena que se encuentre
	 * entre la primera aparición de la palabra “bread” y la segunda aparición de la
	 * palabra “bread”. En caso de no haber dos “bread” devolverá “” (cadena vacía);
	 * 
	 * getSandwich("breadjambread") → "jam" getSandwich("xxbreadjambreadyy") → "jam"
	 * getSandwich("xxbreadyy") → ""
	 * 
	 **/

	// EJEMPLO BUCLE
	public static void asd(String a) {
		int i = 0;
		boolean isH = false;
		while (!isH && i < a.length()) {
			i++;
		}
	}

	public static String getSandwich(String a) {
		int i = 0;
		boolean hasBread = true;

		while (hasBread && i < a.length()) {
			if (a.contains("bread") && !(a.indexOf("bread") == a.lastIndexOf("bread"))) { // la cadena tiene que
																							// contener bread, y que el
																							// el primer y ultimo index
																							// no sean el mismo
				hasBread = false; // para iniciar, después hasBread se pone false y devuelve la cadena
				return a.substring(a.indexOf("bread") + 5, a.lastIndexOf("bread")); // hecha con substring desde el
																					// primer indice de bread +5 (para
																					// devolver lo que hay dentro)
			} // hasta el indice del ultimo bread.
			i++;
		}
		return "";
	}

	/**
	 * 13 [String-2 > wordEnds] Define una función que reciba dos parámetros de tipo
	 * String como entrada. La función deberá devolver una String compuesta por el
	 * carácter que está justo antes y justo después de cada aparición del segundo
	 * parámetro en el primer parámetro.
	 * 
	 * wordEnds("abcXY123XYijk", "XY") → "c13i" wordEnds("XY123XY", "XY") → "13"
	 * wordEnds("XY1XY", "XY") → "11"
	 * 
	 **/

	public static String wordEnds(String a, String b) {
		String comp = "";
		String fin = "";

		if (a.indexOf(b) == 0) {
			fin = a.substring(a.indexOf(b) + b.length(), a.indexOf(b) + b.length() + 1);
			comp = a.substring(a.indexOf(b) + b.length());
		} else if (a.indexOf(b) != 0) {
			fin = a.substring(a.indexOf(b) - 1, a.indexOf(b))
					+ a.substring(a.indexOf(b) + b.length(), a.indexOf(b) + b.length() + 1);

			comp = a.substring(a.indexOf(b) + b.length());
		} 
		if (a.indexOf(b) + b.length() == a.length()) {
			fin = fin + comp.substring(comp.indexOf(b) - 1, comp.indexOf(b));

		} else if (a.indexOf(b) + b.length() != a.length()) {
			fin = fin + comp.substring(comp.indexOf(b) - 1, comp.indexOf(b))
					+ comp.substring(comp.indexOf(b) + b.length(), comp.indexOf(b) + b.length() + 1);

		}
		return fin;
		

		
	}

	public static String aa(String a, String b) {
		String fin = "";

		
		if (a.indexOf(b) == 0) {
			fin = a.substring(a.indexOf(b) + b.length(), a.indexOf(b) + b.length() + 1);
			
		} else if (a.indexOf(b) != 0) {
			fin = a.substring(a.indexOf(b) - 1, a.indexOf(b))
					+ a.substring(a.indexOf(b) + b.length(), a.indexOf(b) + b.length() + 1);

			
		} 
		if (a.indexOf(b) + a.length() == a.length()) {
			fin = fin + a.substring(a.lastIndexOf(b) - 1, a.lastIndexOf(b));

		} else if (a.indexOf(b) + a.length() != a.length()) {
			fin = fin + a.substring(a.lastIndexOf(b) - 1, a.lastIndexOf(b))
					+ a.substring(a.lastIndexOf(b) + b.length(), a.lastIndexOf(b) + b.length() + 1);

		}
		return fin;

	}
}
