package ejercicioPequenio;

public class ejercicioPequenio {

	public static void main(String[] args) {
			System.out.println(ej1("aabbabbaab", "a"));
	}

	public static String ej1(String a, String b) {

		String res ="";
		for (int i = 0; i < a.length(); i++) {
			
			if(a.contains(b.valueOf(b.charAt(i)))) {
				res += b.charAt(i);
			}else {
				a.replace(a.charAt(i), '+');	
			}
			
		}
	
		return res;
	}
}
