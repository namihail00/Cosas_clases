package principal;

public class ejercicios2 {
	public static void main(String[] args) {
		muestraPares(77);
		numeroSegundos(5, 4, 3);
		intervaloTiempo(8, 19, 5, 46);
	}

	/*
	 * Nicolas Mihail Alexandru 1� DAW T4Ej1 - Crea la funci�n con nombre
	 * muestraPares. La funci�n recibir� un entero como par�metro y mostrar� una
	 * lista de n�meros pares menores que el par�metro introducido.
	 */

	public static void muestraPares(int n) {

		while (n >= 2) {

			if (n % 2 == 0) {
				n = n - 2;
				System.out.println(n);
			} else {
				n = n - 1;
				System.out.println(n);
			}
		}

	}

	/*
	 * T4Ej2 - Crea una funci�n con nombre numeroSegundos. La funci�n recibir� tres
	 * enteros positivos que corresponder�n a d�as, horas y minutos. La funci�n
	 * devolver� la cantidad total de segundos que corresponden
	 */

	public static void numeroSegundos(int d, int h, int m) {

		int seg = 0;

		seg = (m * 60) + (h * 3600) + (d * 24 * 3600);
		System.out.println(seg + " segundos");
	}

	/*
	 * T4Ej3 - Crea una funci�n con nombre intervaloTiempo que mostrar� los minutos
	 * que hay entre dos instantes de tiempo (indicando hora y minutos). Para ello
	 * recibir� 4 enteros como par�metros de entrada que tendr�n el siguiente
	 * significado: a. hora del primer instante de tiempo b. minuto del
	 * primerinstante de tiempo c. hora del segundo instante de tiempo d. minuto del
	 * segundo instante de tiempo
	 * 
	 */
	public static void intervaloTiempo(int h1, int m1, int h2, int m2) {

		int tiempo1 = 0;
		int tiempo2 = 0;
		int dif = 0;

		tiempo1 = (h1 * 60) + m1;
		System.out.println(tiempo1);
		tiempo2 = (h2 * 60) + m2;
		System.out.println(tiempo2);
		if (tiempo1 > tiempo2) {
			dif = tiempo1 - tiempo2;
		} else {
			dif = tiempo2 - tiempo1;
		}
		System.out.println(dif + " es la diferencia en minutos");
		int difH = 0;
		int difM = 0;
		// int difH=(dif/60);
		//	int difM=(dif/3600);
		
		if (dif % 60 == 0) {
			System.out.println("La diferencia es de " + difH + " horas y " + difM + " minutos");
		} else {
			difH = dif / 60;
		difM = dif - (difH * 60);

		System.out.println("La diferencia es de " + difH + " horas y " + difM + " minutos");
		}
	}


/*
 * T4Ej4 - Crea una funci�n que devuelva verdadero en caso de que dos n�meros
 * sean similares y falso en caso contrario. Dicha funci�n tendr� el nombre
 * sonSimilares y recibir� dos par�metros de tipo entero por consola.
 * Consideraremos que dos enteros son similares cuando uno de ellos contiene
 * todos los d�gitos de otro.
 * 
 */

public static boolean sonSimilares(int a , int b) {
	
	if(a<=10 && b <=10) {
	int a1;
	int a2;
	
	//partes el numero en 2,3,4,5.. dependiendo de la cantidad de cifras que tengan ambos numeros
	}
	if(a<=100 && b <=100) {
		
	}
	if(a<=1000 && b <=1000) {
	
	}
	if(a<=10000 && b <=10000) {
	
	}
	return false;
	}
}