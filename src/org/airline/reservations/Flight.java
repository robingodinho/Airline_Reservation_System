/* Flight.java
 * Developer: Robin Godinho
 */

package org.airline.reservations;

public class Flight {
	// Fields
	private String departureCity;
	private String arrivalCity;
	private int flightNumber;

	// constructors
	public Flight() {
		departureCity = "Unknown Departure City";
		arrivalCity = "Unknown Arrival City";
		flightNumber = 100;
	}
	public Flight(String departureCity, String arrivalCity, int flightNumber) {
		setDepartureCity(departureCity);
		setArrivalCity(arrivalCity);
		setFlightNumber(flightNumber);
	}
	
	// Getter and Setter for Departure
	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}
	// Getter and Setter for Arrival
	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	
	public void setCities(String arrivalCity, String departureCity) {
		this.arrivalCity = arrivalCity;
		this.departureCity = departureCity;
	}
	// Getter and Setter for FlightNumber
	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public String toString() {
		return "Flight: " + this.getFlightNumber() + " " + this.getDepartureCity() + " - " + this.getArrivalCity(); 
	}
	

}
