package T1Ej17;

/**
 * Nicolas Mihail Alexandru 1º DAW T1EJ17 - Inicializa una variable con un
 * carácter. Devuelve true si es minúscula y false si es mayúscula o cualquier
 * otro carácter. Investiga a qué rango pertenece las minúsculas y al rango que
 * pertenece las mayúsculas.
 * 
 */

public class T1Ej17 {
	public static void main(String[] args) {

		char letra = 'z';
		int letraInt = (int) letra;

		System.out.println(letraInt >= 65 && letraInt <= 90 && letraInt < 65 || letraInt > 90);

		/**
		 * El rango de las minusculas es de 65 a 90 en ASCII
		 */
	}
}
