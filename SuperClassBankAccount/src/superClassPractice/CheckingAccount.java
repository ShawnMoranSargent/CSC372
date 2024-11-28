package superClassPractice;

public class CheckingAccount extends BankAccount {
	private double interest;
	
	public CheckingAccount() {
		super();
		this.interest = 0.3;
	}
	
	public void processWithdrawal(double amount) {
		this.withdrawal(amount);
		if(this.getBalance() < 0) {
			System.out.println("Withdrawal has resulted in an overdraft Fee! Applying Fee!");
			this.withdrawal(30);
			System.out.println("Withdrawal processed");
			System.out.println("Current Balance is: " + this.getBalance());
		}
		
	}
	
	public void displayAccount() {
		System.out.println("***************************************************************");
		System.out.println("AccountID = " + this.getAccountID());
		System.out.println("Name: " + this.getFirstName() + ", " + this.getLastName());
		System.out.println("Balance: " + this.getBalance());
		System.out.println("Interest: " + this.interest);
		System.out.println("***************************************************************");
	}

}
