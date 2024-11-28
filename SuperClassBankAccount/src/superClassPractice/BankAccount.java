package superClassPractice;

public class BankAccount {
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	public BankAccount() {
		balance = 0;
	}

	public void deposit(double amount) {
		this.balance += amount;
		
	}

	public void withdrawal(double amount) {
		this.balance -= amount;
	}

	public void setFirstName(String newName) {
		this.firstName = newName;
	}

	public void setLastName(String newName) {
		this.lastName = newName;
	}

	public void setAccountID(int newAccountID) {
		this.accountID = newAccountID;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAccountID() {
		return this.accountID;
	}

	public double getBalance() {
		return this.balance;
	}

	public void accountSummary() {
		System.out.println("***************************************************************");
		System.out.println("AccountID = " + this.accountID);
		System.out.println("Name: " + this.firstName + ", " + this.lastName);
		System.out.println("Balance: " + this.balance);
		System.out.println("***************************************************************");
	}
	
}
