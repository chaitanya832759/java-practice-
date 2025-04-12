package Conditional_statements;

public class Ifelsestatement {
	public static void main(String[] args) {
		
		int r=585;
		int k=66;
		int result;
		if(r==55 && k==66) {
			
		
			System.out.println("hello");
			result=1;
		}
		else {
		
			System.out.println("this is else part");
			result=0;
			//we no need curly brackets for single statements if we are having multiple statements we need those {}	
		}
		
		
		// we can add by turnary operator 
		 result = (r==55 && k==66) ?1:0;
		 
		 System.out.println(result);
		
	}

}
