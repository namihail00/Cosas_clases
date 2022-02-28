import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;



public class Ud_2Fechas {

	public static void main(String[] args) {
		
		Date fecha1 = new Date();	//FECHA DE HOY
//		System.out.println(fecha1.toString());
		
		Date fecha2 = new Date(0);
//		System.out.println(fecha2.toString());
		
//		System.out.println(fecha1.after(fecha2));	// SABER SI ES DESPUÉS O ANTES
		
		Date fecha11 = new Date(0);
		System.out.println(fecha11.getTime());
	
		GregorianCalendar gc = new GregorianCalendar();
//		System.out.println(gc);
		
		GregorianCalendar gc1 = new GregorianCalendar(2021, 9, 28);
		System.out.println(gc1);
		
//		gc.add(GregorianCalendar.DAY_OF_MONTH, 1);  //AÑADE 1 DIA DEL 28 OCT AL 29 OCT
//		gc.roll(GregorianCalendar.DAY_OF_MONTH, 4); //DA VUELTAS EN EL PROPIO MES PONIENDO 4 ESTANDO EN EL DIA 28 VUELVE AL 1 DE OCTUBRE
//		gc1.set(GregorianCalendar.YEAR, 3096);		// PONER LO INTRODUCIDO SI ESTAMOS A 2021 LO CAMBIA  A 3096 Y YA.
		
//		gc1.isLeapYear(2021);	//SI EL AÑO INTRODUCIDO ES BISIESTO
//		System.out.println(gc1.isLeapYear(GregorianCalendar.YEAR));  //SABER IS ESTE AÑO ES BISIESTO 
		
//		System.out.println(gc1.getActualMaximum(GregorianCalendar.YEAR));		//AÑO MAXIMO
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss yy 'de' MM 'de' dd");	//DAR FORMATO A UN DATE
		Date d = new Date();
		System.out.println(sdf.format(d));
		
		
	}
}
