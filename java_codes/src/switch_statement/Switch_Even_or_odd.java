package switch_statement;

public class Switch_Even_or_odd {
	public static void main(String[] args) {
		
		int A=80;
		int B=0;
		if( A %2==0){
			B=0;
		}
		else {
			B=1;
		}
		
		switch(B) {
		case 0:
			System.out.println("even");
			break;
		case 1:
			System.out.println("odd");
			break;
		default:
			System.out.println("enter the valid number");	
		}
		
		
		
		
			
	}	
}
