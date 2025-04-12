package java_codes;

public class Swapingof2numbers {
	
	public static void main(String[] agrs){
		
		//logic 1 (logic using3rd value)
		
		int a=1,b=2;
		System.out.println("Before swaping values are"+" "+a+","+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("After swapping values"+" "+a+","+b);
		
		//logic 2 (without using 3d value)
		
		a=a+b; //a:1+2=3
		b=a-b; //b:3-2=1
		a=a-b; //a:3-1=2
		
		System.out.println("After swapping value"+" "+a+","+b);
		
		//logic 3 (using * and /)
		
		a=a*b; //a:1*2=2
		b=a/b; //b=1/2
		a=a/b; //a=2/1		
	
		System.out.println("After swapping values"+" "+a+","+b);
		
		
		
	}

}
