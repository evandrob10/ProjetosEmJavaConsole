package Application;

import java.util.Locale;
import java.util.Scanner;

import Entites.Funcionario;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Digite o salario: ");
		Funcionario.salario = sc.nextDouble();
		
		System.out.println("Digite o percentual de aumento: ");
		Funcionario.aumento = sc.nextDouble();
		
		System.out.println("Novo salario é: " + Funcionario.salarioAjustado());
		System.out.println("Imposto a pagar: " + Funcionario.impostoApagar());
		System.out.println("Salario liquido: " + Funcionario.salarioLiquido());
	}
}
