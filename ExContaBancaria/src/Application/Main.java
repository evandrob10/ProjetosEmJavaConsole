package Application;

import java.util.Locale;
import java.util.Scanner;

import model.entites.Account;
import model.exception.AccountException;

public class Main {

	public static void main(String[] args) {
		try {
			Locale.setDefault(Locale.US);
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			Integer number = input.nextInt();
			
			input.nextLine();
			System.out.print("Holder: ");
			String holder = input.nextLine();
			
			System.out.print("Initial balance: ");
			Double balance = input.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = input.nextDouble();
			
			Account account = new Account(number,holder,balance,withdrawLimit);
			
			System.out.println("");
			
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(input.nextDouble());
			System.out.printf("New balance: %.2f",account.getBalance());
			
		}
		catch(AccountException error) {
			System.out.println("Withdraw error: " + error.getMessage());
		}
	}
}
