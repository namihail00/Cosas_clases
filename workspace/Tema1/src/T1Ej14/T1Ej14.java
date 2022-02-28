package T1Ej14;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ14 - Inicializa una variable con una
 * letra, devolver la siguiente en el alfabeto. ¿Qué ocurre cuando utilizo la
 * ‘z’ o la ‘Z’?
 */

public class T1Ej14 {
	public static void main(String[] args) {

		char letra = 'z';

		int letraNext = (int) letra + 1;

		char letraNexto = (char) letraNext;

		System.out.println(letraNexto);

		/**
		 * Lo que ocurre al introducir la 'Z' o 'z' es que nos devuelve "[" o "{" debido
		 * a que es el siguiente caracter en ASCII si a la 'z' le equivale en nº 122 el
		 * 123 es de "{".
		 */
	}

}
