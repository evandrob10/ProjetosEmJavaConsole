package Entites;

public class Funcionario {
	public static final double impostoRenda = 0.06; 
	public static Double salario;
	public static Double aumento;
	
	public static Double salarioAjustado() {
		return ((salario * aumento) / 100 )+ salario;
	} 
	public static Double impostoApagar() {
		return salarioAjustado() * impostoRenda;
	}
	public static Double salarioLiquido() {
		return salarioAjustado() - impostoApagar();
	}
}
