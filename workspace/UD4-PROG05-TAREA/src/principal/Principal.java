package principal;

import com.ejercicio.prog.Vehiculo;
import com.ejercicio.prog.utils.*;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

	static Vehiculo vc = null;

		public static void main(String[] args) {
			
			
			
		}
		
		public static void menuVehiculo() {

			Scanner sc = new Scanner(System.in);

			opcionesMenu();
			Integer opcion = sc.nextInt();
			while(opcion != 9) {
				
				if(opcion==1) {
					System.out.println("Marca: ");
					String marca = sc.nextLine();
					
					System.out.println("Matricula: ");
					String matricula = sc.nextLine();
					
					System.out.println("Kilometros: ");
					Integer kms = sc.nextInt();
					
					System.out.println("FechaMatriculacion (dia): ");
					Integer dia = sc.nextInt();
					System.out.println("FechaMatriculacion (mes): ");
					Integer mes = sc.nextInt();
					System.out.println("FechaMatriculacion (anio): ");
					Integer anio = sc.nextInt();
					
					Date dateMatriculacion = new GregorianCalendar(anio, mes-1, dia).getTime();
					
					System.out.println("Descripcion: ");
					String descripcion = sc.nextLine();
					
					System.out.println("Precio: ");
					Double  precio = sc.nextDouble();
					
					System.out.println("Nombre propietario: ");
					String nombreProp = sc.nextLine();
					
					System.out.println("Dni prop: ");
					String dniProp = sc.nextLine();
					
					if(datosVehiculoValidos(dateMatriculacion, mes, dniProp)) {
					
//						vc = new Vehiculo(marca, matricula, kms, dateMatriculacion, descripcion, precio, nombreProp, dniProp);
						
					}else {
						
						System.err.println("Has introducido mal algun dato");
					}
					
					
					
					
				}else if(opcion==2) {
					
				}else if(opcion==3) {
					
				}else if(opcion==4) {
					
				}else if(opcion==5) {
					
				}else if(opcion==6) {
					
				}else if(opcion==7) {
					
				}else if(opcion==8) {
					
				}
				
			}
			
			
			
			
			
			
			// Llama metodo del menu
			opcionesMenu();

			// se pide introducir una de las opciones del menu
			System.out.println("Introduzca alguna opcion del menu");

		}
		
		
		private static boolean datosVehiculoValidos(Date fechaMatriculacion, Integer kilometros,String dni) {
				return new Date().after(fechaMatriculacion) && 
					kilometros > 0 && 
					dni.length()==9 &&
					Character.isLetter(dni.charAt(dni.length()-1));
		}
		

		// metodo con las opciones del menu

		public static void opcionesMenu() {
			System.out.println("1 . Nuevo vehiculo");

			System.out.println("2. Ver matricula");

			System.out.println("3. Ver numero de kilometros");

			System.out.println("4. Actualizar kilometros");

			System.out.println("5. Ver anios de antiguedad");

			System.out.println("6. Ver propietario");

			System.out.println("7. Mostrar descripcion");

			System.out.println("8.Mostrar precio");

			System.out.println("9. Salir");
		}
	
	//menu
		
		
}

	