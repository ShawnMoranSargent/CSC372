package superClassPractice;


public class mainTest {
	public static void main(String[] args){
		BankAccount AccountOne = new BankAccount();
		CheckingAccount AccountTwo = new CheckingAccount();
		AccountOne.setFirstName("Shawn");
		AccountOne.setLastName("Moran");
		AccountOne.setAccountID(1);
		AccountOne.deposit(50.50);
		AccountOne.withdrawal(0.50);
		AccountOne.accountSummary();
		
		AccountTwo.setAccountID(2);
		AccountTwo.setFirstName("John");
		AccountTwo.setLastName("Halo");
		AccountTwo.deposit(10);
		AccountTwo.displayAccount();
		AccountTwo.processWithdrawal(30);
		AccountTwo.displayAccount();
		
	}
}

