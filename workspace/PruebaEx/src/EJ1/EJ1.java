package EJ1;

public class EJ1 {
	public static void main(String[] args) {

		System.out.println(transformarString("asdasd", "a"));
	}

	public static String transformarString(String s1, String s2) {

		String resultado = "";

		for (int i = 0; i < s1.length(); i++) {

			if (s2.contains(String.valueOf(s1.charAt(i)))) {
				resultado += s1.charAt(i);
			} else {
				resultado = resultado + "+";
			}
			
		}
		return resultado;

	}
}
