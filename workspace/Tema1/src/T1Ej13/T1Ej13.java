package T1Ej13;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ13 - Inicializa una variable con una
 * letra, devolver su correspondiente mayúscula.
 */

public class T1Ej13 {
	public static void main(String[] args) {

		char letraMinuscula = 'n';

		int letraMayusculaEntero = (int) letraMinuscula - 32;

		char letraMayuscula = (char) letraMayusculaEntero;

		System.out.println(letraMayuscula);

		/**
		 * Primero casteo la letra en cuestion a INT (a su valor ASCII) y le resto 32
		 * para hacerla MAYUSCULA y después vuelvo a hacer el cast a char para que me
		 * saque la mayuscula
		 */

	}
}
