package Colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {
	public static void main(String[] args) {
//	HashSet<String> conjuntoStrings = new HashSet<String>();
//	conjuntoStrings.add("Nik");
//	conjuntoStrings.add("Mih");
//	conjuntoStrings.add("Alex");
//	
//	System.out.println(conjuntoStrings.size());
//	System.out.println(conjuntoStrings);
//	
//	TreeSet<Integer> conjuntoEnteros = new TreeSet<Integer>();
//	conjuntoEnteros.add(10);
//	conjuntoEnteros.add(15);
//	conjuntoEnteros.add(14);
//	System.out.println(conjuntoEnteros);
//	
//	LinkedHashSet<Double> conjuntoDoubles = new LinkedHashSet<Double>();
//	conjuntoDoubles.add(2.5);
//	conjuntoDoubles.add(420.69);
//	conjuntoDoubles.add(-44.09);
//	System.out.println(conjuntoDoubles);
//	
//	HashSet<String> hsStrings = new HashSet<String>();
//	hsStrings.add("alva");
//	hsStrings.add("zkzk");
//	hsStrings.add("ijij");
//	hsStrings.remove("zkzk");
//	
//	System.out.println(hsStrings);
//	
//	HashSet<String> hsStr2 = new HashSet<String>();
//	hsStr2.addAll(hsStrings);

		ArrayList<String> arrayStr = new ArrayList<String>();
		arrayStr.add("Spidermon");
		arrayStr.add("MJ");
		arrayStr.add("Green Goblino");
		arrayStr.add("Spidermon");
		System.out.println(arrayStr);
		
		
		sets();

	}

	public static void sets() {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hsStr = new HashSet<String>();
		LinkedHashSet<String> hsStr2 = new LinkedHashSet<String>();
		boolean parado = false;
		String line = "";

		while (!parado) {
			line = sc.nextLine();
			if (line.contains("para")) {
				System.out.println(hsStr2);
				System.out.println(hsStr);
				parado = true;
			} else
				hsStr2.add(line);
			hsStr.add(line);
		}

	}

}
