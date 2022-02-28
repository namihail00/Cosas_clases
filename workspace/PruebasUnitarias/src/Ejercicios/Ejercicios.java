package Ejercicios;

public class Ejercicios {
	public static void main(String[] args) {
		
//		sleepIn	- pruebas
		System.out.println("sleepIn(true, true)=true: "+(sleepIn(true, true)==true));
		System.out.println("sleepIn(false, false)=false: "+(sleepIn(false, false)==true));
		System.out.println("sleepIn(true, false)=true: "+(sleepIn(true, false)==false));
		System.out.println("sleepIn(false, true)=true: "+(sleepIn(false, true)==true));
		
		
		System.out.println();
		System.out.println();
		
		
// 		monkeyTrouble - pruebas
		System.out.println("monkeyTrouble(true, true)==true: "+(monkeyTrouble(true, true)==true));
		System.out.println("monkeyTrouble(false, false)==true: "+(monkeyTrouble(false, false)==true));
		System.out.println("monkeyTrouble(true, false)==false: "+(monkeyTrouble(true, false)==false));
		System.out.println("monkeyTrouble(false, true)==false: "+(monkeyTrouble(false, true)==false));
		
		
		System.out.println();
		System.out.println();
		
		
//		sumDouble
		System.out.println("sumDouble(1, 2) = 3: "+(sumDouble(1, 2)==3));
		System.out.println("sumDouble(3, 2) = 5: "+(sumDouble(3, 2)==5));
		System.out.println("sumDouble(2, 2) = 8: "+(sumDouble(2, 2)==8));
		
		
		System.out.println();
		System.out.println();
		
//		diff21
		
		System.out.println("diff21(19) = 2: "+ (diff21(19)==2));
		System.out.println("diff21(10) = 11: "+ (diff21(10)==11));
		System.out.println("diff21(21) = 0: "+ (diff21(21)==0));
		
		
		System.out.println();
		System.out.println();
		
		
//  	Parrot trouble
		
		System.out.println("parrotTrouble(true, 6) = true: " + (parrotTrouble(true, 6)==true));
		System.out.println("parrotTrouble(true, 7) = false: " + (parrotTrouble(true, 7)==false));
		System.out.println("parrotTrouble(false, 6) = false: " + (parrotTrouble(false, 6)==false));
		
	}

//1
	public static boolean sleepIn(boolean weekday, boolean vacation) {

		if (weekday && !vacation) {
			return false;
		} else if (weekday && vacation) {
			return true;
		} else if (!weekday && !vacation) {
			return true;
		} else if (!weekday && vacation) {
			return true;
		}else return false;
	}

//2
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		if (aSmile && bSmile) {
			return true;
		} else if (!aSmile && !bSmile) {
			return true;
		} else {
			return false;
		}

	}

//3
	public static int sumDouble(int a, int b) {

		if (a == b) {
			return (a + b) * 2;
		} else {
			return a + b;
		}
	}
//4

	public static int diff21(int n) {

		if (n <= 21) {
			return Math.abs(21 - n);
		} else if (n > 21) {
			return Math.abs((n - 21) * 2);
		}
		return n;

	}
	
//5
	public static boolean parrotTrouble(boolean talking, int hour) {
		  if(talking && (hour < 7 || hour > 20)){
		    return true;
		  }else return false;
		}
	
//6
	public static boolean makes10(int a, int b) {
	    
	    if(a == 10 || b == 10){
	      return true;
	    }else if (a+b==10){
	      return true;
	    }else return false;
	}
	
//7
	public static boolean nearHundred(int n) {
		  if((n>=90 && n<=110) || (n>=190 && n<=210)){
		    return true;
		  }else return false;
		}
	
//8
	public static boolean posNeg(int a, int b, boolean negative) {
		  if(((a < 0 && b > 0)|| (a>0 && b<0)) && !negative){
		    return true;
		  }else if(((a < 0 && b > 0)||(a>0 && b<0))&& negative){
		    return false;
		  }else if (a<0 && b<0 && negative){
		    return true;
		  }else return false;
		}
	
//9
	public String notString(String str) {
		 if(str.length()>=3){ 
		  if(str.substring(0, 3).contains("not")){
		    return str;
		  }else return "not "+str;
		 }else return "not "+str;

		 }
//10
	
}
