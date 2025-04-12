package operators;

public class Logical_operator {
	
	public static void main(String[] args) {
		//and &,or | ,not equal !
		
		int a =6;
		int b= 9;
		int c=3;         //varible declarition 
		int d=56;
		  
		boolean result= d > a && b>c ;
		
		System.out.println("result of || && is "+result);
		
		//we use & and && bother are same function by looking it into but difference in execution internally 
		
		boolean result1= c>a || b>c ;
		
		System.out.println("result of || is " + result1);
		

		System.out.println("same result of || if you use ! is " + !result1);
		
		
		
	}

}
