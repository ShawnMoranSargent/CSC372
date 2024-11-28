package BankGUI;

public class Account{
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	public Account() {
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

}
