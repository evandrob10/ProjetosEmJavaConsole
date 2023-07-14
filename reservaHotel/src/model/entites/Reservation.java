package model.entites;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DominExceptions;

public class Reservation {
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkout;
	
	public static final DateTimeFormatter formato  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation() {}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout){
		if(checkin.isAfter(checkout)) throw new DominExceptions("Check-out date must be after check-in date");
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckout() {
		return checkout;
	}
	
	public Long duration () {
		Duration duration = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());
		return duration.toDays();
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout){
		LocalDate now = LocalDate.now();
		if(checkin.isBefore(now) || checkout.isBefore(now)) throw new DominExceptions("Reservation dates for update must be future dates");
		if(checkin.isAfter(checkout)) throw new DominExceptions("Check-out date must be after check-in date");
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return String.format("Reservation: Room %d, check-in: %s, check-out: %s, %d nights", roomNumber,formato.format(checkin),formato.format(checkout),duration());
	}
	
}
