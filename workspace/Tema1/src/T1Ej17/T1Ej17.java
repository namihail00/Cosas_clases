package T1Ej17;

/**
 * Nicolas Mihail Alexandru 1� DAW T1EJ17 - Inicializa una variable con un
 * car�cter. Devuelve true si es min�scula y false si es may�scula o cualquier
 * otro car�cter. Investiga a qu� rango pertenece las min�sculas y al rango que
 * pertenece las may�sculas.
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
