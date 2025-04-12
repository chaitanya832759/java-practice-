package basicbanking_applicationmethodsDemo;

public class Banking_application {
	static int balance =0;
	public static void main(String[] args) {
		
		checkBalance();
		deposit(400);
		withdraw(50);

	}
	

	public static void checkBalance() {
		System.out.println(balance);
	}

	public static void deposit(int amountadd) {
		balance =balance+ amountadd;
		System.out.println(balance);
	}
	
	public static void withdraw(int amountwithdraw) {
		balance = balance-amountwithdraw;
		System.out.println(balance);
	}

}
