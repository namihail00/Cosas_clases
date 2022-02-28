package EJERCICIOS_NAVIDAD;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EJ_NAVIDAD {
public static void main(String[] args) {
	HashMap<Integer, HashSet<String>> alumnoAsignaturas = new HashMap <Integer, HashSet<String>>();
	HashMap<String, HashSet<String>> cursoAsignaturas = new HashMap <String, HashSet<String>>();
	
	int opcion = elegirOpc();
	
	if(opcion==1) {
		
	}else if(opcion==2) {
		
	}
	
	
}

public static boolean matricularAlumno(HashMap<Integer, HashSet<String>> alumnoAsignaturas) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce identificador alumno: ");
	int idAlumno = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Introduce identificador asignatura: ");
	String idAsig = sc.nextLine();
	
	
	if(!alumnoAsignaturas.containsKey(idAlumno)) {
		
	alumnoAsignaturas.put(idAlumno, new HashSet<String>());
		
	}
		boolean isAdded = alumnoAsignaturas.get(idAlumno).add(idAsig);	
			
			return isAdded;
	}

public static boolean desmatricularAlumno(HashMap<Integer, HashSet<String>> alumnoAsignaturas) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce identificador alumno: ");
	int idAlumno = sc.nextInt();
	
	sc.nextLine();
	
	System.out.println("Introduce identificador asignatura: ");
	String idAsig = sc.nextLine();
	
	
	if(!alumnoAsignaturas.containsKey(idAlumno)) {
		System.err.println("El indentificador no corresponde a un alumno");
		
	}else {
		HashSet<String> asignaturasAlumno = alumnoAsignaturas.get(idAlumno);
		if(!asignaturasAlumno.contains(idAsig)) {
			System.err.println("El indentificador no corresponde a una asignatura");
		}else {
			
		}
	}
		boolean isAdded = alumnoAsignaturas.get(idAlumno).add(idAsig);	
			
			return isAdded;
	}

public static int elegirOpc() {
	Scanner sc = new Scanner(System.in);
	System.out.println(
			"1.	Matricular alumno en asignatura. \n"
			+"2.	Desmatricular alumno en asignatura. \n"
			+"3.	Crear un curso con asignaturas. \n"
			+"4.	Ver información de un alumno (asignaturas matriculado). \n"
			+"5.	Ver información de un curso (asignaturas asociadas al curso).\n"
			+"6.	Alumno en curso. \n"
			+"7.	Salir");
	System.out.println("Introduce una opcion: ");
	int opcion = sc.nextInt();
	return opcion;
}


}
