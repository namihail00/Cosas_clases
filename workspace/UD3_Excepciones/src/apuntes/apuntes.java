package apuntes;

public class apuntes {
	public static void main(String[] args) {
		
		try {
		System.out.println(lanzadorExcepciones(11));
		}catch(ArithmeticException e) {
			System.out.println("Tas pasao"); 
		}
	}

	
	public static int lanzadorExcepciones(int numero) throws ArithmeticException {
		Boolean dentroRango = (numero >= 0 && numero <= 10);

		if (dentroRango) {
			return numero;
		} else {
			throw new ArithmeticException("No se encuentra en el rango");
		}
	}
	
	
	public static void llamarLanzador() {
		System.out.println(lanzadorExcepciones(11));
	}

}

  