package principal;

//https://lineadecodigo.com/java/numeros-primos-en-java/

public class ejerciciosTeoremaSheldon {

	public static void main(String[] args) {
		int a =4;
		char x = (char)a;
		System.out.println(x);
		multiplicacionDigitos(73);
		System.out.println(multiplicacionDigitos(73));
		System.out.println(esPrimo(73));
	}
	// Comprobar si n es primo o no
		public static boolean esPrimo(int n) {
			boolean primo = true;
			int cont = 1;
			int cont2 = 1;
			while (cont <= n) {
				if (n % cont == 0) {
					cont2++;
				}
				if (n % cont2 > 2) {
					primo = false;
				}
				cont++;
			}
//		lo mismo pero con for:
//			for(int cont=1;cont<=n;cont++) {
//				if(n%cont==0) {
//					cont2++;
//				}
//				if(n%cont2>2) {
//					primo=false;
//				}	
//			}

			return primo;
		}


	// Multiplicación de los digitos de n
	public static int multiplicacionDigitos(int n) { // usar long
		int multiplic=1;
		int digito=1, aux =0;
		
		if(n<10) {
			multiplic=n;
		}
		if(n>=10 && n<=99){
				int digito1=1;
				digito1 = n/10;
				digito = digito * n%10;
				multiplic=digito*digito1;
		}
		if(n>=100 && n<=999) {
			int digito1=n/100;
			int digito2=(n%100)/10;
			int digito3=n%10;
			multiplic=digito1*digito2*digito3;
				}
		if(n>=1000 && n<=3000) {
			int digito1=n%1000;
			int digito2=(n%1000)/100;
			int digito3=(n%100)/10;
			int digito4=n%10;
		}
			
				
		//digito = digito* n%10;		pasar por cada digito
		//multiplic=multiplic*digito;
		
		return multiplic;
	}

	
	// Comprobar y sacar la posición del primo
	public static int posPrimos(int n) {
		int aux = n;
		if (esPrimo(n) == true) {
			for (int cont = 1; cont <= n; cont++) {
				while (n % cont == 0) {
					// este while provisional
				}
			}
		}
		return n;
	}

	// dar la vuelta a un numero
//	  4321
//	  1 x 10 elevado (digitos-1) = 1000
//	  2 x 10 elevado (digitos-2) = 200
//	  3 x 10 elevado (digitos-3) = 30
//	  4 x 10 elevado (digitos-4) = 4	suma es 1234

	//función para elevar un numero, donde numero es la base y exponente, exponente.
	public static long exponente(long numero, long exponente) {
		long resultado =1;
		if (exponente!=0) {
			for(int i = 0; i <exponente; i++) {
				resultado = numero * resultado;
			}
		}
		
		return resultado;
	}
	//dado un numero devuelve los digitos que tiene
	public static long numeroDigitos(long numero) {
		int i=1;
		while(numero/10 > 0) {
			i++;
			numero = numero/10;
		}
		return i;
	}
	
	// dado un numero devuleve la multiplicacion de sus digitos.
	// Por ejemplo si introduce 123 duelve 8
	public static long multiplicacionDigitos(long numero) {
		long multiplicacion =1;
		
		while (numero / 10 >0){
			multiplicacion = multiplicacion * (numero%10);
			numero = numero /10;
		}
		return multiplicacion * numero;
	}
	//Dado un numero devolverá su inverso. 123 --> 321, preguntar a bilal por su reverso
	public static long reversoNumero(long numero) {
		
		long reverso=0;
		long posicion= exponente(10, numeroDigitos(numero)-1);
		
		while(posicion!=0){
			reverso= reverso +((numero%10)*posicion);
			numero = numero/10;
			posicion = posicion/10;
		}
		
		return reverso;
	}
	//pos primo
	public static int posicionPrimo(long n) { 
		int posicion=0;
		for(int i=2; i<=n;i++) {
			if(esPrimo(i)) {
				posicion++;
		}
	}
		return posicion;
}
}