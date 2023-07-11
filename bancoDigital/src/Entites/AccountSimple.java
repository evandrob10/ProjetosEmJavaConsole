package Entites;

public class AccountSimple {
	protected String numberAccount;
	protected Double balance;
	protected boolean cardCredit = false;
	
	public AccountSimple(String numberAccount, Double balance) {
		this.numberAccount = numberAccount;
		this.balance = balance;
	}
	public  AccountSimple(String numberAccount) {
		this.numberAccount = numberAccount;
	}
	public String getNumberAccount() {
		return numberAccount;
	}
	public Double getBalance() {
		return balance;
	}
	public void deposit(Double deposit) {
		this.balance += deposit;
	}
	public void withdraw(Double withdraw) {
		this.balance -= withdraw;
	}
}
