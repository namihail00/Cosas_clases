package principal;

public class ejercicios {
	public static void main(String[] args) {

		descomponerNumero(177);
	}

	/*
	 * 
	 * Degine una funcion de nombre rpeetir que tenga un parametro de entrada tipo
	 * int y que no devuelva nada. Dicha funcion debera mostrar por pantalla
	 * "Hola mundo" tantas veces como lo indique el par�metro de entrada
	 **/
	/*
	 *
	 * 1. Nombre -- repetir 2. Arg de entrada -- 1 entero 2. Arg de salida -- salida
	 * ninguno
	 */

	public static void repetir(int r) {

		for (int i = 0; i < r; i++) {

			System.out.println("Hola mundo");
		}
	}

	/*
	 * T4Ej2 - Define una funci�n de nombre rangoValores que reciba dos par�metros
	 * de entrada de tipo entero y un par�metro de tipo booleano. Si el par�metro
	 * booleano es verdadero se mostrar�n los valores comprendidos entre los dos
	 * par�metros enteros incluyendo ambos par�metros, si el par�metro es falso se
	 * mostrar� el rango de valores pero sin incluir los par�metros de entrada.
	 */

	public static void rangoValores(int n, int m, boolean inclusive) {

		if (!inclusive) { // al ser booleano viene por default en true
			n++;
			m--;
		}

		for (int i = n; i <= m; i++) {
			System.out.println(i);
		}

	}

	/**
	 * T4Ej3 - Define una funci�n con nombre maximo que recibe como par�metros de
	 * entrada dos enteros y devolver� el mayor de ellos.
	 * 
	 * 
	 *
	 */

	public static int maximo(int n, int m) { // pide enteros y por eso es una funcion de int
		int numero;

		if (n > m) {
			numero = n;
			return n;
		} else {
			numero = m;
			return m;
		}

	}

	/*
	 * T4Ej4 - Define una funci�n que se llame esConsonante que recibe como
	 * par�metro de entrada un car�cter y devolver� true en caso de que ese car�cter
	 * sea una consonante o false en caso de que sea una vocal.
	 * 
	 *
	 *
	 **/

	public static boolean esConsonante(char c) { // boolean ya que es lo que pide
		boolean isConsonante = true;

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			isConsonante = false;
		}
		return isConsonante; // return false por que el char seleccionado es c y no es vocal
	}

	/*
	 * T4Ej5 - Define una funci�n que se llame esPrimo que recibe como par�metro de
	 * entrada un n�mero entero y devolver� true en caso de que sea primo y falso en
	 * caso contrario.
	 */

	public static boolean esPrimo(int n) {
		boolean primo = true;
		int i = 2;
		while (primo && i < n) {
			if (n % 1 == 0) {
				primo = false;
			}
			i++;
		}
		return primo;
	}


/*
 * T4Ej6 - Define una funci�n descomponerNumero que reciba como par�metro de
 * entrada un n�mero entero y mostrar� por pantalla su descomposici�n en
 * factores primos. Pista: utiliza la funci�n anterior. 
 */

	public static void descomponerNumero(int n) {
		int i = 2;
		while(i<=n) { 	//condicion de entrada que i=2 siempre sea menor o igual al numero del que lo queremos decomponer
			if(esPrimo(i) && n%i==0) {	//
				System.out.println(i);
				n=n/i;
				i=2;
			}else {
				i++;
			}
		}
		
		
		
	}
}
//		for(int x=0; n <= 1; x++ ) {
//			
//		
//		if( primo = true) {
//			c=n/2;
//			System.out.println(c);
//									//buscar desdel 2 hasta el n buscando primos (for) si se cumple n/2 y  a hacer modulo hasta encontrar el numero
//		}
//		if(primo= false) {
//			c=n;
//		}
//		}
//		
//		System.out.println(c);
//		
//	}
//}