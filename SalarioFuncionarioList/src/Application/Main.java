package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import Entites.Funcionarios;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Funcionarios> funcionarios = new ArrayList<>();	
		System.out.println("How many employees will be registered? ");
		int quantity = sc.nextInt();
		int count = 1;
		do {
			funcionarios.add(newFuncionario(count));
			count++;
		}while(count <= quantity);
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		System.out.print("Enter the percentage: ");
		Double percentage = sc.nextDouble();
		
		try {
			for(Funcionarios funcionario : funcionarios) {
				if(funcionario.getId() == id) {
					funcionario.updateSalary(percentage);
				}
			}
			viewFuncionarios(funcionarios);
		}catch(Exception e) {
			System.out.println("Aconteceu erro aqui");
		}

		sc.close();
	}
	public static Funcionarios newFuncionario (int posicao) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Emplyoee #%d:\n", posicao);
		
		System.out.print("id:");
		int funcionarioId = sc.nextInt();
		
		System.out.print("name:");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Salary:");
		Double salary = sc.nextDouble();
		
		return new Funcionarios(funcionarioId,name,salary);
	}
	public static void viewFuncionarios (List <Funcionarios> listFuncionarios) {
		System.out.println("List of employees");
		for(Funcionarios funcionario : listFuncionarios ){
			System.out.println(funcionario.toString());
		}
	}
}
