/* Passenger.java
 * Written by: Robin Godinho
 * We will keep the Passenger class 
 * as simple as possible,
 * assuming each passenger has a
 * unique name.
 */
package org.airline.reservations;
public class Passenger {
	// fields
	private String name; // Passenger Name
	
	// constructors
	public Passenger() {
		name = "Unknown name"; // default name
	}
	
	public Passenger(String name) { // create Passenger and set the name at the same time
		setName(name); // the setName method, and pass in name
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// setter
	public void setName(String newName) {
		name = newName;
	}
	
	public String toString() {
		return "Passenger: " + this.getName();
	}
}

