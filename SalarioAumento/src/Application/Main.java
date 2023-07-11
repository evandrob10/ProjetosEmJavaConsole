package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entites.Employee;
import Entites.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		List <Employee> employees = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner x = new Scanner(System.in);
		
		System.out.printf("Enter the number of employees: ");
		int num = x.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.printf("Employee #%d data: \n",i);
			
			System.out.printf("Outsourced (y/n)? ");
			char opcao = x.next().charAt(0);
			
			x.nextLine();
			System.out.print("Name: ");
			String name = x.nextLine();

			System.out.print("Hours: ");
			Integer hours = x.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = x.nextDouble();
			
			if(opcao == 'y') {
				System.out.printf("Additional charge: ");
				Double additional = x.nextDouble();
				
				employees.add(new OutsourcedEmployee(name,hours,valuePerHour,additional));
			}else {
				employees.add(new Employee(name,hours,valuePerHour));
			} 
		}
		System.out.println("");
		System.out.println("PAYMENTS:");
		for(Employee employee : employees) {
			System.out.printf("%s - $ %.2f\n",employee.getName(),employee.payment());
		}

	}

}
