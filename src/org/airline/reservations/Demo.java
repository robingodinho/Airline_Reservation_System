package org.airline.reservations;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        // initialize database
        Database prodDB = new Database();
        prodDB.bootstrap(); // add seats and flights

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
            finally {
                // Close the scanner after the loop is done
                if (!always) {
                    screenInput.close();
                }
            }
        }
    }
}
