package org.airline.reservations;
import java.time.LocalDate;
import java.util.ArrayList;

public class Database {
	// fields
	private ArrayList<Seat> seats;
	private ArrayList<Passenger> passengers;
	private ArrayList<Flight> flights;
	private ArrayList<Ticket> tickets;
	
	
	// constructor
	public Database() {
		seats = new ArrayList<Seat>();
		passengers = new ArrayList<Passenger>();
		flights = new ArrayList<Flight>();
		tickets = new ArrayList<Ticket>();
	}

	// getters
	public ArrayList<Seat> getSeats() {
		return seats;
	}
	
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	
	public ArrayList<Flight> getFlights() {
		return flights;
	}
	
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	
	// creating a new seat object, passing in an integer.
	public void addSeat(int seatNumber) {
		seats.add(new Seat(seatNumber)); 
	}

	public boolean addPassenger(String passengerName) {
		boolean passengerExists = false;
		// Loop through getPassenger() array to see if the passenger already exists.
		// if passenger exists change to True
		for(Passenger item : getPassengers() ) {
			if(passengerName.equals(item.getName())) {
				passengerExists = true;
			}
		}
		// if passenger does NOT exist, then add the passenger.
		if(passengerExists == false) {
			passengers.add(new Passenger(passengerName));
		}
		return passengerExists;
	}

	public void addFlight(String departureCity, String arrivalCity, int flightNumber) {
		flights.add(new Flight(departureCity, arrivalCity, flightNumber));
	}
	
	public String addTicket(LocalDate departureDate, String passengerName, int flightNumber, int seatNumber) {
		// finding the Passenger object
		Passenger ticketPassenger = null; // empty object 
		for (Passenger item : getPassengers()) {
			if (passengerName.equals(item.getName())) { // compares name of each object to our input
				ticketPassenger = item; // if it finds it, set it equal to that item	
			}
		}
		
		// finding Flight object
		Flight ticketFlight = null;
		for (Flight item: getFlights()) {
			if(flightNumber == item.getFlightNumber()) {
				ticketFlight = item;
			}
		}
		
		// finding the Seat object
		Seat ticketSeat = null;
		for (Seat item : getSeats()) {
			if(seatNumber == item.getSeatNumber()) {
				ticketSeat = item;
			}
		}
		
		// Creating a new ticket 
		Ticket tempTicket = new Ticket();
		tempTicket.setDepartureDate(departureDate);
		tempTicket.setPassenger(ticketPassenger);
		tempTicket.setFlight(ticketFlight);
		tempTicket.setSeat(ticketSeat);
		tickets.add(tempTicket);
		return tempTicket.toString();
	}
	
	// Method that checks available seats
	public ArrayList<Seat> getOpenSeats(LocalDate departureDate, int flightNumber){
		ArrayList<Seat> openSeats = getSeats(); // new Array list 'openSeats' that returns all of the seats
		for(Ticket item: getTickets()) {
			if(departureDate.equals(item.getDepartureDate()) && flightNumber ==  item.getFlight().getFlightNumber()) {
				openSeats.remove(item.getSeat()); // remove seat because it is taken
			}
		}
		return openSeats;
	}
	
	public void bootstrap() {
		// adding the seats
		addSeat(1);
		addSeat(2);
		addSeat(3);
		addSeat(4);
		addSeat(5);
		addSeat(6);
		
		// adding the flights
		addFlight("Los Angeles", "Chicago", 1000);
		addFlight("Chicago", "New York", 1010);
		addFlight("New York", "Chicago", 2000);
		addFlight("Chicago", "Los Angeles", 2010);
	}
}


