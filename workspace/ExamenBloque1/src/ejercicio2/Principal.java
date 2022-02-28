package ejercicio2;

public class Principal {
	public static void main(String[] args) {
		System.out.println(multDigitos(12345));

	}

	public static int multDigitos(int a) { // metodo donde recursivamente multiplicamos los digitos de un numero

		if (a <= 10) { // caso base
			return a;
		} else
			return a % 10 * multDigitos(a / 10);

	}
}
