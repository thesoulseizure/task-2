package Task2;

// Question 1.3


//creating class account
public class Account {
	int acno;
	float balance;
	
	
	// creating a parameterized constructor to initialize the attributes
	public Account(int acno, float balance) {
		this.acno = acno;
		this.balance = balance;
	}
	
	
	// creating a method to deposit amount to the account
	public void deposit(int d) {
		System.out.println("Amount Deposited : " + d);
		balance = balance + d;
		System.out.println("the balance is : " + balance);
	}
	
	
	//creating a method to withdraw amount from the account
	public void withdraw(int w) {
		System.out.println("Amount Withdrawn : " + w);
		balance = balance - w;
		System.out.println("the balance is : " + balance);
	}
	
	
   // creating a method to show balance
	public void showBalance() {
		System.out.println("the balance is : " + balance);
	}
	
	
	
	public static void main(String[] args) {
		// creating an object of account class
		Account a = new Account(123456789, 100000f);
		System.out.println("The Account Number is : " + a.acno);
		System.out.println("The initial balance is : " + a.balance);
		System.out.println("=========================");
		a.deposit(50000);
		System.out.println("=========================");
		a.withdraw(2000);
		System.out.println("=========================");
		a.showBalance();
	}
}
