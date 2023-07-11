package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entites.Department;
import Entites.HourContract;
import Entites.Worker;
import Entites.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Enter department's name: ");
		Department department = new Department(sc.nextLine());
		
		System.out.println("Enter worker data: ");
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.printf("Level: ");
		WorkerLevel level = WorkerLevel.valueOf(sc.nextLine());
		System.out.printf("Base salary: ");
		Double baseSalary = sc.nextDouble();
		
		Worker trabalhador = new Worker(name, level, baseSalary, department);
		
		System.out.printf("How many contracts to this worker?");
		int numero = sc.nextInt();
		
		int count = 0;
		while(count < numero) {
			System.out.printf("Enter contract #%d data",count);
			
			System.out.printf("Date (DD/MM/YYYY): ");
			sc.nextLine();
			LocalDate date = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			System.out.printf("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.printf("Duration (hours): ");
			Integer hours = sc.nextInt();
			
			trabalhador.addContract(new HourContract(date,valuePerHour,hours));
			count++;
		}
		
		System.out.printf("Enter month and year to calculate icome (MM/YYYY): ");
		sc.nextLine();
		String periodo = sc.nextLine();
		String [] mesAno = periodo.split("/");
		System.out.printf("name: %s\n",trabalhador.getName());
		System.out.printf("Department: %s\n",trabalhador.getDepartment());
		System.out.printf("Income for %s: %.2f\n",periodo,trabalhador.income((Integer.parseInt(mesAno[0])), Integer.parseInt(mesAno[1])));
		sc.close();
	}

}
