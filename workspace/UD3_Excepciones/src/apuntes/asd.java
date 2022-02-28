package apuntes;

//public class asd {
//	public static void main(String[] args) {
//	    Scanner sc = new Scanner(System.in);
//	    int num;
//	    int contador;
//	    
//	        System.out.println("Introduce un numero epico");
//	        num = sc.nextInt();
//	    
//
//	        for (int conta = 1; conta <= primo; conta++) {
//	            if (primo % conta == 0)
//	                contador++;
//	        }
//	        if(contador=2){
//	            System.out.println("Tu numero "+num+" es primo");
//	        }else{
//	            System.out.println("Tu numero "+num+" no es primo");
//	        }
//	       
//
//	    }
//	}
public class asd{
	
	public static void main(String[] args) {
		
		System.out.println("not today".contains("not"));
		"".substring(0, 0);	
		}
	
	public String notString(String str) {
		 if(str.length()>=3){ 
		  if(str.substring(0, 3).contains("not")){
		    return str;
		  }else return "not "+str;
		 }else return "not "+str;

		 }
	
	public String missingChar(String str, int n) {
	    //str=bbbbbb
	    //3
		if(str.length() == 0){
	    return "";
	    }else return str.substring(0,n)+str.substring(n,str.length()-1); //probar esta linea en coding bat copiar todo como esta
	    
	      
	    
	}
}

