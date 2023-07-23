package entities;

public class Account {
	private String accountNumber;
	private String holder;
	private double balance;
	
	public Account(String accountNumber, String holder, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public Account(String accountNumber, String holder) {
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) {
		balance -= value + 5;
	}

	@Override
	public String toString() {
		return "Account: " + accountNumber 
		+ ", Holder: " + holder 
		+ ", Balance: $ " + String.format("%.2f", balance);
	}
	
}
