package Entites;

public class AccountBunises extends Account {
	private Double limiteCredito;

	public AccountBunises(String name, Double saldo, Double limiteCredito) {
		super(name, saldo);
		this.limiteCredito = limiteCredito;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
}
