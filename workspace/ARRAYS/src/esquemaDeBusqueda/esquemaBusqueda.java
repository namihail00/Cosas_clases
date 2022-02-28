package esquemaDeBusqueda;

public class esquemaBusqueda {
	public static void main(String[] args) {
		int randomnum[] = { 1, 8, 5, 3, 0 };

		System.out.println(maximo(randomnum));
		System.out.println(buscar(randomnum, 0));

	}

	/*
	 * Escribe una funci�n de nombre maximo que reciba como par�metro un array de
	 * enteros, y que devuelva el m�ximo valor contenido en dicho array.
	 * 
	 */

	public static int maximo(int[] enteros) {
		int max = 0;

		for (int i = 0; i < enteros.length; i++) {

			if (max < enteros[i]) {
				max = enteros[i];
			}

		}
		return max;
	}

	/*
	 * Crea una funci�n de nombre buscar que reviba como par�metro un array de
	 * enteros y un entero. Devolver� -1 si no encuentra el entero dentro del array,
	 * y si lo encuantra, devolver� la posici�n del array en el que esta.
	 */

	public static int buscar(int[] array, int buscado) {

		int cont = 0;
		while (cont < array.length) {

			if (array[cont] == buscado) {
				return cont;
			}
			cont++;
		}
		return -1;
	}

	/*
	 * Lo mismo de arriba pero con string
	 */

}
