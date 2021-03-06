package Haiku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Haiku {

	public static void pers() {
		new Random().nextInt();
	}

	public static boolean Haiku(ArrayList<String> haiku) {
		Scanner sc = new Scanner(System.in);
		int sil1 = 1;
		while (haiku.size() <= 3) {
			haiku.add(sc.nextLine());
		}

		for (int i = 0; i < haiku.size(); i++) {

			for (int j = 0; j < haiku.get(i).length(); j++) {
				if (haiku.get(i).equalsIgnoreCase(" ") || haiku.get(i).equalsIgnoreCase("-")) {
					sil1++;
				}
			}

		}
		return false;
	}

	/*
	 * Adem?s de la m?trica, es muy interesante saber el n?mero de veces que se
	 * repite una s?laba. Implementa una funci?n que reciba un haiku por par?metro y
	 * devuelva una estructura de datos que almacene cuantas veces aparece una
	 * determinada s?laba. Puedes probar con los siguientes haikus del libro Haikus
	 * unmortales, de A. Cabezas Garc?a.
	 * 
	 */
	
	public static HashMap<String, Integer> nVecesSilaba() {
		
		HashMap<String, Integer> resultado = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		
		String l1  = sc.nextLine();
		String l2  = sc.nextLine();
		String l3  = sc.nextLine();
		
		ArrayList<String> haiku = new ArrayList<String>();
		
		forHaiku(resultado, haiku);
		return resultado;
	}

	private static void forHaiku(HashMap<String, Integer> resultado, ArrayList<String> haiku) {
		for (String verso : haiku) {
			String[] silabasVerso = splitSilabas(verso);
			for (String silaba : silabasVerso) {
				if(!resultado.containsKey(silaba)) {
					resultado.put(silaba, 0);
				}else {
					int repeticiones = resultado.get(silaba);
					resultado.replace(silaba, repeticiones+1);
				}
			}
		}
	}
	
	private static String[] splitSilabas(String l1) {
		
		String[] silabas = l1.replace(" ", "-").split("-");
		return silabas;
		
	}
	
}