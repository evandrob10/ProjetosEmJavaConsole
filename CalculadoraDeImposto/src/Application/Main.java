package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entites.Pessoa;
import Entites.PessoaFisica;
import Entites.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		List <Pessoa> contribuintes = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int num = x.nextInt();
		
		for(int i = 1; i <= num;i++) {
			System.out.printf("Tax payer #%d data:\n",i);
			
			System.out.print("Individual or company (i/c)? ");
			char option = x.next().charAt(0);
			
			x.nextLine();
			
			System.out.printf("Name: ");
			String name = x.nextLine();
			
			System.out.printf("Anual income: ");
			Double anualIcome = x.nextDouble();
			
			if(option == 'i') {
				System.out.printf("Health expenditures: ");
				Double healthExpenditures = x.nextDouble();
		
				contribuintes.add(new PessoaFisica(name,anualIcome,healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int employeesNumber = x.nextInt();
				
				contribuintes.add(new PessoaJuridica(name,anualIcome,employeesNumber));
			}
		}
		System.out.println("");
		System.out.println("TAXES PAID: ");
		for(Pessoa contribuinte : contribuintes) {
			System.out.printf("%s: $ %.2f\n",contribuinte.getName(),contribuinte.tax());
		}
		System.out.println("");
		Double sumTaxes = 0.0;
		for(Pessoa contribuinte : contribuintes) {
			sumTaxes += contribuinte.tax();
		}
		System.out.printf("TOTAL TAXES: %.2f",sumTaxes);
	}

}
