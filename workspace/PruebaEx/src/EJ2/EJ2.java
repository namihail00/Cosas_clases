package EJ2;

import java.util.Date;
import java.util.GregorianCalendar;

public class EJ2 {

	public static void main(String[] args) {
		
		System.out.println(restarFecha("05-05-2021", 365));
	}



	public static Date restarFecha(String fecha, Integer nDias) {
		
		Integer dia = Integer.valueOf(fecha.substring(0, 2));
		
		Integer mes = Integer.valueOf(fecha.substring(3, 5));
		
		Integer anio = Integer.valueOf(fecha.substring(6));
		
		GregorianCalendar gc = new GregorianCalendar(anio, mes-1, dia);
		gc.add(GregorianCalendar.DAY_OF_MONTH, -1*nDias);
		
		return gc.getTime();
	}
}