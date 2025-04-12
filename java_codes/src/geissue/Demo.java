package geissue;

public class Demo {
	private String number;
	
	public void slicingNumber(String value) {
		if(value.length() > 8) {
			number = value.substring(0,8);			
		}
		else {
			number = value;
		}
	}
	//can write 
	//number = (input.value.length()>8) ? value.substring(0,8) : value;
	
	public static void main(String[] args) {
		
		Demo dem = new Demo();
		dem.slicingNumber("123456789012345678901234567890");
		System.out.println("number"+dem.number);
		
		
		
	}

}
