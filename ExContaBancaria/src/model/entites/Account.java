package model.entites;

import model.exception.AccountException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimite;
	
	public Account() {}

	public Account(Integer number, String holder, Double balance, Double withdrawLimite) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimite = withdrawLimite;
	}

	public Integer getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimite() {
		return withdrawLimite;
	}
	
	public void deposit (Double amount) {
		balance += amount;
	}
	
	public void withdraw (Double amount) {
		if(amount > withdrawLimite) throw new AccountException("The amount exceeds withdraw limit");
		if(balance < amount) throw new AccountException("Not enough balance");
		balance -= amount;
	}
}
