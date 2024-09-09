package org.airline.reservations;

public class Seat {
	// fields
	private int seatNumber;

	// constructor
	public Seat() {
		setSeatNumber(10); // if a passenger hasn't been assigned a seat
	}
	public Seat(int seatNumber) {
		setSeatNumber(seatNumber);
	}
	
	// Getter and Setter Method
	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	public String toString() {
		return "Seat: " + this.getSeatNumber();
	}
	
}
