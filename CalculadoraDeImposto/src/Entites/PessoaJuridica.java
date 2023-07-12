package Entites;

public class PessoaJuridica extends Pessoa {
	private int employeeNumber;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, int employeeNumber) {
		super(name, rendaAnual);
		this.employeeNumber = employeeNumber;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Override
	public final Double tax() {
		Double tax;
		if (employeeNumber > 10) { 
			tax = rendaAnual * (0.14); 
		}else {
			tax = rendaAnual  * (0.16);
		}
		return tax;
	}
	
	
}
