package ejercicio3;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		modFecha();
	}

	public static void modFecha() {
		Scanner sc = new Scanner(System.in);
		GregorianCalendar gc1 = new GregorianCalendar();
		System.out.println("Introduce una fecha con el formato 'dia-mes-año hora:minutos'");
		String fecha1 = sc.nextLine();

		Integer anio = Integer.valueOf(fecha1.substring(0, 2));
		Integer mes = Integer.valueOf(fecha1.substring(3, 5));
		Integer dia = Integer.valueOf(fecha1.substring(6, 10));
		Integer hora = Integer.valueOf(fecha1.substring(11, 13));
		Integer minutos = Integer.valueOf(fecha1.substring(14));

		System.out.println(mes);
		System.out.println(dia);
		System.out.println(hora);
		System.out.println(minutos);
		System.out.println(anio);

		System.out.println("a. Minutos que quedan hasta otra fecha (mismo formato que antes).");
		System.out.println("b. Mostrar dias que quedan para final de mes.");
		System.out.println("c. Mostrar en formato 'año mes día' la fecha introducida.");
		String b = sc.nextLine();

		if (b.equalsIgnoreCase("a")) {
			System.out.println("Introduce OTRA fecha con el formato 'dia-mes-año hora:minutos'");
			String fecha2 = sc.nextLine();
			casoA(fecha1, fecha2);

		} else if (b.equalsIgnoreCase("b")) {
			int diasFaltan = gc1.DAY_OF_MONTH - dia;

		} else if (b.equalsIgnoreCase("c"))
			System.out.println(casoC(anio, mes, dia));

	}

	public static GregorianCalendar casoC(int anio, int mes, int dia) {
		GregorianCalendar fechaInversa = new GregorianCalendar(anio, mes - 1, dia);
		return fechaInversa;
	}

	public static long casoA(String fecha1, String fecha2) {

		Integer anio = Integer.valueOf(fecha1.substring(0, 2));
		Integer mes = Integer.valueOf(fecha1.substring(3, 5));
		Integer dia = Integer.valueOf(fecha1.substring(6, 10));
		Integer hora = Integer.valueOf(fecha1.substring(11, 13));
		Integer minutos = Integer.valueOf(fecha1.substring(14));

		Integer anio2 = Integer.valueOf(fecha2.substring(0, 2));
		Integer mes2 = Integer.valueOf(fecha2.substring(3, 5));
		Integer dia2 = Integer.valueOf(fecha2.substring(6, 10));
		Integer hora2 = Integer.valueOf(fecha2.substring(11, 13));
		Integer minutos2 = Integer.valueOf(fecha2.substring(14));

		GregorianCalendar f1 = new GregorianCalendar(anio, mes, dia, hora, minutos);
		GregorianCalendar f2 = new GregorianCalendar(anio2, mes2, dia2, hora2, minutos2);

		Date fe1 = f1.getTime();
		Date fe2 = f2.getTime();

		return ((f1.getTimeInMillis() - f2.getTimeInMillis()) / 1000) / 60;
	}

}
