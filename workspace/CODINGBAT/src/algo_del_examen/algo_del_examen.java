package algo_del_examen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class algo_del_examen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
	
		System.out.println(numeroAleatorio());
		
		
		
		System.out.println(diaSemana(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		 

		

		

	}

	public static void tiempoName() {
		Scanner sc = new Scanner(System.in);
		Date inicio = new Date();
		System.out.println("Introduce el nombre");
		String name = sc.nextLine();
		System.out.println("Introduce apellido");
		String apellido = sc.nextLine();
		Date fin = new Date();

		double time = (fin.getTime() - inicio.getTime()) / 1000;
		System.out.println();

		/*
		 * /*Realiza un script que pida un nombre y dos apellidos e indique el tiempo
		 * que se tardo en introducir los datos. La salida sería algo asi como: En
		 * introducir Luís Perez Alonso Ha tardado 25 segundos.
		 * 
		 * System.out.println("Introduce tu nombre y apellidos"); Date antesIntro = new
		 * Date(); Long aI= antesIntro.getTime();
		 * 
		 * String fullName=sc.next();
		 * 
		 * Date despuesIntro = new Date(); Long after= despuesIntro.getTime();
		 * 
		 * System.out.println((after-aI)/1000 + " segundos");
		 * 
		 */

	}

	public static String diaSemana(int year, int month, int day) {

		GregorianCalendar gc1 = new GregorianCalendar(year, month-1, day);
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		gc1.get(Calendar.DAY_OF_WEEK);
		int n =gc1.get(GregorianCalendar.DAY_OF_WEEK);

		return "El dia "+day+" del mes "+month+" del año "+year+", es "+sdf.format(gc1.getTime());
			

	}

	public static int succesion(int a) {

		if (a == 0) {
			return 1;
		} else {
			int c = succesion(a - 1);
			System.out.println(c);

			return 2 * c + 1;
		}
	}
	
	
	public static String numeroAleatorio() {
		StringBuilder numeros = new StringBuilder("0123456789");
		Random r = new Random();
		String resultado = "";

		while(numeros.length()!=0) {
			int index = r.nextInt(numeros.length()); //indice aleatorio
			char digito = numeros.charAt(index);	//digito aleatorio
			numeros.deleteCharAt(index);	//lo elimino de numeros
			resultado = resultado + digito;	//agregar digito al resultado
		}
		return resultado;
		
	}
	

}