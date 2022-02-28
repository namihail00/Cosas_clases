package Ej_DateGregorianCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ej_DateGregorianCalendar {

	public static void main(String[] args) {
		GregorianCalendar c = new GregorianCalendar(2024, 10, 1);
		Date asd = new Date(999999999);
		Date asd2 = new Date(c.getTimeInMillis());
		
		GregorianCalendar c2 = new GregorianCalendar(2020, 9, 1);
		
//		System.out.println(miCumpleanios(asd));

//		System.out.println(diaDeLaSemana(asd));

//		System.out.println(c.isLeapYear((GregorianCalendar.YEAR)));

//		System.out.println(diasTieneElMes("February"));
//		System.out.println(diasEntreFechas(c.getTime(), c2.getTime()));
//		alarma(5);
//		System.out.println(fechaBonita3(asd2));
		int a=0;
		
		GregorianCalendar gcTI = new GregorianCalendar();
		for (int i = 0; i < 7485831; i++) {
			if(i<1000000) {
				System.out.println(i);
			}
			}
		GregorianCalendar gcTF = new GregorianCalendar();
		
		long dur = Math.abs((gcTI.getTimeInMillis()-gcTF.getTimeInMillis()));
		System.out.println(dur/1000);
		}
		
	/*
	 * public static Date miCumpleaniosDate() Devolverá tu fecha de cumpleaños
	 * utilizando un objeto de tipo Date (java.util)
	 */

	public static Date miCumpleanios(Date a) {
		GregorianCalendar cumple = new GregorianCalendar(2021, 9, 1);
		return cumple.getTime();
	}

	/*
	 * public static Date miCumpleaniosCalendar() Devolverá tu fecha de cumpleaños
	 * utilizando un objeto de tipo GregorianCalendar.
	 */

	public static GregorianCalendar miCumpleaniosCalendar() {

		GregorianCalendar cumple = new GregorianCalendar(2021, 9, 1);

		return cumple;
	}

	/*
	 * public static Date esMayor(Date d1, Date d2) Dadas dos fechas de cumpleaños,
	 * devolver aquella de la persona más mayor.
	 */

	public static Date esMayor(Date a, Date b) {
		if (a.before(b)) {
			return a;
		} else {
			return b;
		}

	}
	/*
	 * 
	 * public static Date esMayor(Date d1, GregorianCalendar d2) Dadas dos fechas de
	 * cumpleaños, devolver aquella de la persona más mayor.
	 * 
	 */

	public static Date esMayor(Date a, GregorianCalendar b) {

		if (a.before(b.getTime())) {
			return a;
		} else {

			return b.getTime();
		}
	}

	/*
	 * public static int getAnioFechaAnterior(Date d1, Date d2) Dadas dos fechas,
	 * devolver el año de aquella menos reciente.
	 */

	public static int getAnioFechaAnterior(Date d1, Date d2) {

		GregorianCalendar gc1 = new GregorianCalendar();
		GregorianCalendar gc2 = new GregorianCalendar();
		if (d1.before(d2)) {
			gc1.setTime(d1);
			return gc1.get(GregorianCalendar.YEAR);
		} else {
			gc2.setTime(d2);
			return gc2.get(GregorianCalendar.YEAR);
		}

	}

	public static boolean esBisiesto(Date d1) {
		GregorianCalendar gc1 = new GregorianCalendar();
		gc1.setTime(d1);
		return gc1.isLeapYear((GregorianCalendar.YEAR));
	}

	public static boolean esBisiesto(Integer anio) {
		GregorianCalendar gc1 = new GregorianCalendar(anio, 0, 0);

		return gc1.isLeapYear(anio);
	}

	public static String diaDeLaSemana(Date fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		String a = sdf.format(fecha);
		return a;
	}

	public static int diasTieneElMes(String month) {
		GregorianCalendar calendar = new GregorianCalendar(2018, 2, 28);
		return calendar.getActualMaximum(calendar.DAY_OF_MONTH);

	}

//	Dadas dos fechas, indicar el número de dias que hay entre ellas. 
	public static int diasEntreFechas(Date d1, Date d2) {

//		GregorianCalendar calendar = new GregorianCalendar();
//		GregorianCalendar calendar1 = new GregorianCalendar();
//		
//		calendar.setTime(d1);
//		calendar1.setTime(d2);
//		long milis1 = calendar.getTimeInMillis();
//		long milis2 = calendar1.getTimeInMillis();
//		if(milis1 > milis2) {
//			return (int)(milis1-milis2)/86400000;
//			
//		}else {
//			return (int)(milis2-milis1)/86400000;
//		}

		long milis1 = d1.getTime();
		long milis2 = d2.getTime();

		long time = Math.abs(milis1 - milis2);

		long dias = time / (1000 * 60 * 60 * 24); // 86400000 milisec en un dia

		return (int) dias;
	}

//	public static String fechaBonita1(Date d1) {
//		
//		
//	}

	public static void alarma(int minutos) {
		GregorianCalendar gcAlarma = new GregorianCalendar();

		gcAlarma.add(GregorianCalendar.MINUTE, minutos); // futuro

		GregorianCalendar gcAhora = new GregorianCalendar(); // presente

		while (!gcAhora.equals(gcAlarma)) {
			gcAhora = new GregorianCalendar();
		}

		while (gcAhora.before(gcAlarma)) { // lo mismo que el while de arriba

		}
		while (new GregorianCalendar().before(gcAlarma)) { // lo mismo que el while de arriba

		}

		System.out.println("alarma!!");

//		calendar.get(GregorianCalendar.MINUTE);

//		while(calendar.get(GregorianCalendar.MINUTE) <=  calendar.add(GregorianCalendar.MINUTE,minutos)) {
//		if(calendar.get(GregorianCalendar.MINUTE) == calendar.get(GregorianCalendar.MINUTE)+minutos) {
//			System.out.println("alarma!!");
//			}
//		}

	}

	public static String fechasBonitas(Date d1) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		return sdf.format(d1);
	}
	
	public static String fechaBonita3(Date d1) {
		String a="";
		return a;
	}

}
