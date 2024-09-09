package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatabaseTest {

	@Test
	public void testDatabase() { // test the constructor
		Database testDB = new Database();
		assertEquals(0, testDB.getSeats().size());
		assertEquals(0,testDB.getPassengers().size());
		assertEquals(0, testDB.getFlights().size());
		assertEquals(0, testDB.getTickets().size());
	}
	
	@Test
	public void testAddSeat() {
		Database testDB2 = new Database();
		testDB2.addSeat(2); //Seat only has a field of seatNumber
		assertEquals(1,testDB2.getSeats().size());
		assertEquals(2, testDB2.getSeats().get(0).getSeatNumber());
	}
	
	@Test
	public void testAddPassenger() {
		Database testDB3 = new Database();
		testDB3.addPassenger("Robin"); //Passenger has one field that is a string
		assertEquals(1, testDB3.getPassengers().size());
	}
	@Test
	public void testAddNewPassenger() {
		Database testDB6 = new Database();
		boolean result1 = testDB6.addPassenger("Robin Godinho");
		assertEquals(false, result1);
	    boolean result2 = testDB6.addPassenger("Robin Godinho");
	    assertEquals(true, result2);
	}
	
	@Test
	public void testAddFlight() {
		Database testDB4 = new Database();
		testDB4.addFlight("Chicago", "Los Angeles", 1000); //Passenger has one field that is a string
		assertEquals(1, testDB4.getFlights().size());
	}
	@Test
	public void testBootstrap() {
		Database testDB7 = new Database();
		testDB7.bootstrap();
		assertEquals(6, testDB7.getSeats().size());
		assertEquals(4, testDB7.getFlights().size());
	}
}

	