package org.airline.reservations;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

public class Console {

    public static void main(String[] args) {
        
        // initialize database
        Database prodDB = new Database();
        prodDB.bootstrap(); // add seats and flights
       // String passengerName = null;
        int flightNumber = -1;
        boolean validFlightNumber = false;
        int seatNumber = -1;
        boolean validSeatNumber = false;
        LocalDate departureDate = LocalDate.now();
        
        // initialize console
        boolean always = true;
        Scanner screenInput = new Scanner(System.in);
        String passengerName = null;
        while (always) {
        	
            try {
            	
                // ask for passengerName and validate input
                System.out.println("Enter Your Name: ");
                passengerName = screenInput.nextLine();

                // Check if the input is a valid name (contains only letters and spaces)
                if (!passengerName.matches("[a-zA-Z ]+")) {
                    throw new IllegalArgumentException("Invalid name. Please enter letters only.");
                }

                // check if the passenger exists
                boolean result = prodDB.addPassenger(passengerName);
                
                // respond to the passenger
                if (result) {
                    System.out.println("Welcome Back " + passengerName);
                } else {
                    System.out.println("Welcome " + passengerName);
                }

            //always = false; // for testing purposes to exit the loop
            } 
            catch (IllegalArgumentException e) {
                // Handle invalid name input (numbers, symbols, etc.)
                System.out.println(e.getMessage()); // Display the error message
            }
            
           // show flights and ask for flight selection
           System.out.println("\nHere is a list of available flights: ");
           for (Flight item: prodDB.getFlights()) {
        	   System.out.println(item);
           }
           System.out.println("Enter the Flight Number to book a ticket: ");
           
           while (!validFlightNumber) {
        	   try {
        		   
            	   flightNumber = screenInput.nextInt();
            	   }
        	   catch (InputMismatchException e) {
        		   System.out.println("Invalid flight number. Please enter a valid integer.");
                   screenInput.next(); // Clear the invalid input
            	   }
        	   System.out.println("You have selected flight number: " + flightNumber);
               validFlightNumber = true;
           }
           
           // show the available seats and request seat selection
           System.out.println("\nThank you booking your flight, ");
           System.out.println("Here are the available seats on the flight");
           ArrayList<Seat> openSeats = prodDB.getOpenSeats(departureDate, flightNumber);
           for (Seat item: openSeats) {
        	   System.out.println(item.getSeatNumber());
           }
           System.out.println("\nPlease enter the seat number that you want: ");
           while (!validSeatNumber) {
        	  try {
        		 seatNumber = screenInput.nextInt(); 
        	  }
        	  catch (InputMismatchException e) {
       		   System.out.println("Invalid seat number. Please enter a valid integer.");
                  screenInput.next(); // Clear the invalid input
           	   }
        	  System.out.println("The seat that you have selected is " + seatNumber);
        	  validSeatNumber = true;
           }
           // create a ticket and return the info
           String ticketInfo = prodDB.addTicket(departureDate, passengerName, flightNumber, seatNumber);
           System.out.println("\nReservation Successful. Here are your details:");
           System.out.println(ticketInfo + "\n");
        	
           always = false; // for testing purposes to exit the loop
           // Close the scanner after the loop is done
           if (!always) {
                    screenInput.close();
                }
        }
    }
}
