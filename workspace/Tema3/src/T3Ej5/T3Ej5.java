package T3Ej5;

import java.util.Scanner;

/**
 * Nicolas Mihail Alexandru 1� DAW T3Ej5 - Dise�a un programa que vaya pidiendo
 * al usuario las edades de los empleados de una empresa hasta que el usuario
 * introduzca un 0. Se mostrar�: La suma de todas las edades. La media de las
 * edades. El n�mero de alumnos en total. El n�mero de alumnos mayores de edad.
 * El % de alumnos mayores de edad.
 */

public class T3Ej5 {
	public static void main(String[] args) {

		int positivo=-1;
		int media= 0; //Aunque se llame media lo uso como variable para mantener la suma de las edades.
		int totalIntroducido=0;
		int mayorEdad=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca todas las edades de los empleados/alumnos (seguidas): ");
		System.out.println("Introduzca 0 para finalizar la serie de numeros");
		positivo = sc.nextInt();
		
		while(positivo != 0) {
			
			media=media+positivo;
			totalIntroducido++;
			positivo = sc.nextInt();
			
			if(positivo>18) {
				mayorEdad++; 	//variable que ir� sumando 1 cada vez que introduzca un mayor de edad		
			}
				
		
		}
		System.out.println("Media: "+ media/totalIntroducido);
		System.out.println("Total alumnos/empleados: "+ totalIntroducido);
		System.out.println("Total suma edades: "+media);
		System.out.println("Total de mayores de edad: "+mayorEdad);
		System.out.println("Total de mayores de edad en %: "+ (mayorEdad*100)/totalIntroducido+"%"); //regla de 3 para calcular el %
	}
}
