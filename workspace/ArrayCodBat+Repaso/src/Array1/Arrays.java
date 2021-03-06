package Array1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {

//		int[] nums = { 5551, 33, 4, 5, 6 };
//
//		System.out.println(nums.length);

//		ArrayList<Integer> nums = new ArrayList<Integer>();
//		nums.add(9);
//		nums.add(245);
//		nums.add(99);
//		nums.add(342);
//		nums.add(99);
//		Integer a = 88;
//		
//		System.out.println(nums);

//		for (int i = 0; i < nums.size(); i++) {
//			
//			System.out.println(nums.indexOf(i));
//		}

//
//		System.out.println(a.toString().length());

//		Integer cont = 0;
//		boolean condicion = cont.toString().length() <= 4;
//		System.out.println(condicion);

//		ArrayList<Integer> epik = new ArrayList<Integer>();
//
//		epik = collectionCuatro();
//
//		System.out.println(epik.get(1));

//		System.out.println(collectionUno(nums));
//		System.out.println(collectionDos(nums));
//		System.out.println(nums.indexOf(99));
//		System.out.println(collectionTres());

//		System.out.println(collectionCinco());
		System.out.println(collectionSeis());
	}

	/*
	 * Given an array of ints, return true if 6 appears as either the first or last
	 * element in the array. The array will be length 1 or more.
	 */

	// lenght -1 para dar el ultimo

	public static boolean firstLast6(int[] nums) {

		if (nums[0] == 6) {
			return true;
		} else if ((nums[nums.length - 1]) == 6) {
			return true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the array is length 1 or more, and the
	 * first element and the last element are equal. sameFirstLast([1, 2, 3]) →
	 * false sameFirstLast([1, 2, 3, 1]) → true sameFirstLast([1, 2, 1]) → true
	 */

	/*
	 * 1. Implementa una funcion que reciba un objeto de tipo ArrayList<Integer>
	 * como entrada y devuelva el elemento de mayor valor.
	 */

	public static int collectionUno(ArrayList<Integer> nums) {
		Integer max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > max)
				max = nums.get(i);
		}

		return max;
	}

	/*
	 * 2. Implementa un funcion que reciba un objeto de itpo ArrayList<Integer> como
	 * entrada y devuleva la media de todos sus registros.
	 * 
	 */

	public static Double collectionDos(ArrayList<Integer> nums) {
		Double media = 0.0;

		for (int i = 0; i < nums.size(); i++) {
			media = media + nums.get(i);
		}

		return media / nums.size();
	}

	/*
	 * 3. Implementa una funcion que lea 20 entero por consola, los almacene en un
	 * objeto de tipo ArrayList y duelva cuantos de ellos superan la media.
	 */

	public static Integer collectionTres() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();

		Integer cont = 1;
		Double media = 0.0;

		while (cont <= 20) {
			System.out.println(cont);
			nums.add(sc.nextInt());
			cont++;

		}

		for (int i = 0; i < nums.size(); i++) {

			media = media + nums.get(i);
		}

		media = media / nums.size();
		Integer sobreMedia = 0;

		for (int i = 0; i < nums.size(); i++) {

			if (nums.get(i) > media) {
				sobreMedia++;
			}

		}

		return sobreMedia;
	}

	/*
	 * 4. Implementa una funcion que calcule los numeros capicuas de cuatro cifras
	 * multiplos de 45 y los almacene en un ArrayList
	 */

	public static ArrayList<Integer> collectionCuatro() {
		ArrayList<Integer> capicua = new ArrayList<Integer>();
		Integer cont = 0;
		boolean condicion = cont.toString().length() <= 4;

		while (condicion) {

			if (cont % 45 == 0 && cont == reverse(cont)) {
				capicua.add(cont);
			}
			cont++;
		}

		return capicua;
	}

	// funcion auxiliar para revertir
	public static Integer reverse(Integer num) {
		Integer reversed = 0;

		while (num != 0) {
			Integer digito = num % 10;
			reversed = reversed * 10 + digito;
			num /= 10;
		}

		return reversed;
	}

	/*
	 * 5. Implementa una funcion que devuelva una coleccion de 100 numeros
	 * aleatorios compendidos entre 0 y 300, pudiendose repetir alguno
	 */

	public static ArrayList<Integer> collectionCinco() {
		ArrayList<Integer> cienN = new ArrayList<Integer>();

		Random r = new Random();

		for (int i = 0; i <= 100; i++) {
			cienN.add(r.nextInt(301));
		}

		return cienN;
	}

	/*
	 * 6. Implementa una funcion que devuelva una coleccion con los numeros
	 * comprendidos entre el 1 y el 100 ordenados de forma aleatoria
	 */

	public static LinkedHashSet<Integer> collectionSeis() {
		Random r = new Random();
		LinkedHashSet<Integer> unoCien = new LinkedHashSet<Integer>();

		for (int i = 0; unoCien.size() <= 100; i++) {
			unoCien.add(r.nextInt(101));
		}

		return unoCien;
	}

	/*
	 * 7. Implementa una funcion que reciba como parametro una Collection de objetos
	 * de tipo string. La funcion debera devolver el elemtno menor y eleminarlo del
	 * objeto Collection.
	 */

	public static String collectionSiete(ArrayList<String> array) {
		String min = array.get(0);

		for (int i = 0; i < array.size(); i++) {

			if (min.compareToIgnoreCase(array.get(i)) < 0) {
				min = array.get(i);
			}

		}
		array.remove(min);

		return min;

	}

	public static boolean esPalindromo(String palabra) {
		char[] palabraChars = palabra.toCharArray();
		int j = palabraChars.length - 1;

		for (int i = 0; i < palabraChars.length; i++) {
			if (palabraChars[i] != palabraChars[j]) {
				return false;
			}
			j--;
		}
		return true;
	}

	public static ArrayList<Integer> listaOmirps() {
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		for (int i = 2; i <= 1000; i++) {
			if (esPrimo(i) && reverse2Int(i) != i && esPrimo(reverse2Int(i))) {
				resultado.add(i);
			}
		}
		return resultado;
	}

	public static Integer reverse2Int(Integer entero) {

		char[] enteroChars = entero.toString().toCharArray();
		char[] enteroInvertidoChars = new char[enteroChars.length];

		int j = 0;
		for (int i = enteroChars.length; i >= 0; i--) {

			enteroInvertidoChars[j] = enteroChars[i];
			j++;
		}

		String enteroInvertido = "";
		for (char c : enteroInvertidoChars) {
			enteroInvertido = enteroInvertido + c;
		}

		return null;
	}

	public static boolean esPrimo(Integer entero) {

		for (int i = 2; i < entero; i++) {
			if (entero == 0)
				return false;
		}
		return true;
	}

	private static Boolean isAnagrama(String palabra1, String palabra2) {

		if (palabra1.trim().length() == palabra2.trim().length()) {

			char[] palabra1Char = palabra1.toCharArray();
			char[] palabra2Char = palabra2.toCharArray();

			int j = palabra2.length();
			for (int i = 0; i < palabra1Char.length; i++) {

				if (palabra1Char[i] != palabra2Char[j]) {
				}
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	public static int[] zeroMax(int[] nums) {

		
		
		return null;
	}

}