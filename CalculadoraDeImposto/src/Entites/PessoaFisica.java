package Entites;

public class PessoaFisica extends Pessoa {
	private Double healthExpenses;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String name, Double rendaAnual, Double healthExpenses) {
		super(name, rendaAnual);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public final Double tax() {
		Double tax;
		if(rendaAnual > 20000) {
			tax = ((rendaAnual * 0.25) - (healthExpenses / 2));
		}else {
			tax = ((rendaAnual * 0.15) - (healthExpenses / 2));
		}
		return tax;
	}
}
