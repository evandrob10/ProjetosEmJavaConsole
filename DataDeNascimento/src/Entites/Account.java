package Entites;

public class Account {
	protected String name;
	protected Double Saldo;
	
	public Account(String name, Double saldo) {
		this.name = name;
		Saldo = saldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSaldo() {
		return Saldo;
	}

	public void setSaldo(Double saldo) {
		Saldo = saldo;
	}

}
