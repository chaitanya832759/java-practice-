package java_codes;

public class Add2numbers {
	//Write a Program in Java to Add two Numbers.
	public static int add(int a,int b) {
		return(a+b);
	}
	//main function 
	public static void main(String[] args) 
	{
		
		Add2numbers ad = new Add2numbers();
		
		int result = ad.add(22,34);
		
		System.out.println(result);

	}

}
