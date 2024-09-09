package org.airline.reservations;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicketTest {

	@Test
	public void testSetPassenger() {
		Ticket testTicket1 = new Ticket();
		Passenger testPassenger1 = new Passenger("Robin Godinho");
		// call setPassenger method
		testTicket1.setPassenger(testPassenger1);
		assertEquals("Robin Godinho", testTicket1.getPassenger().getName());
	}
	@Test
	public void testSetFlight() {
		Ticket testTicket2 = new Ticket();
		Seat testSeat1 = new Seat(2);
		//call setSeat method
		testTicket2.setSeat(testSeat1);
		assertEquals(2, testTicket2.getSeat().getSeatNumber());
		
	}
	
}
