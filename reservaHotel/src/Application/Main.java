package Application;

import java.time.LocalDate;
import java.util.Scanner;

import model.entites.Reservation;
import model.exceptions.DominExceptions;

public class Main {

	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Room Number: ");
			Integer numberRoom = input.nextInt();
			
			input.nextLine();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			String checkInDate = input.nextLine();
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			String checkOutDate = input.nextLine();
			
			Reservation reservation =  new Reservation(numberRoom,LocalDate.parse(checkInDate,Reservation.formato),LocalDate.parse(checkOutDate,Reservation.formato));
			
			System.out.println(reservation);
			System.out.println("");
			
			System.out.println("Enter data to update the reservation: ");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkInDate = input.nextLine();
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOutDate = input.nextLine();
			
			reservation.updateDates(LocalDate.parse(checkInDate,Reservation.formato),LocalDate.parse(checkOutDate,Reservation.formato));
			
			System.out.println(reservation);
		}
		catch(DominExceptions error) {
			System.out.println("Error in reservation: " + error.getMessage());
		}
	}

}
