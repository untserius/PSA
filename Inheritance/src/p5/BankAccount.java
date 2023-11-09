package p5;

public class BankAccount {
	
	private String accountNo;
	private double balance;
	
	public BankAccount(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance; 
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("Insufficient Amount!");
		}
	}
	
	public double getBalance() {
		return balance;
	}
}
