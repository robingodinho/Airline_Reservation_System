
# Airline Reservation System

The Airline Reservation System is a Java-based console application designed to simulate the core functionalities of an airline booking system. The project allows users to input their names, select flights, choose available seats, and generate a ticket with their reservation details. 

Key features include:
- Managing passenger information and flight schedules.

- Displaying available seats and handling seat reservations.

- Generating and displaying detailed ticket information for booked flights.

The project was developed using a test-driven development (TDD) approach to ensure high reliability and code quality. Core components, such as the Passenger, Seat, Flight, and Ticket classes, were built and refined through unit tests, ensuring that each module works as expected before integrating them into the overall system.

This project demonstrates object-oriented programming, robust error handling, and database management, with a focus on scalability and maintainability through TDD.
## Class Descriptions
 - ***Passenger:*** This class represents a passenger in the system. It stores the passenger's name and potentially other relevant information like their booking history. The Passenger class allows for the management of individual customer data.

- ***Seat:*** This class represents a seat on a flight. It stores details like the seat number and its availability. This class helps track which seats are reserved and which are still open for booking.

- ***Flight:*** The Flight class models a flight, including its flight number, departure date, available seats, and any other flight-specific details. It handles tasks like displaying available seats and managing reservations for a specific flight.

- ***Database:*** The Database class acts as a central repository, storing and managing the application's data, including passengers, flights, seats, and tickets. It provides methods to add, retrieve, and manage this information, simulating the behavior of an actual database.



## Demo

![Poster Image](https://github.com/robingodinho/Airline_Reservation_System/blob/323d2076d45d7d2d0afe7a92956fa6e2e64d24f2/example_image.png)
## How To Download and Run the code

**Step 1: Clone the Repository**

To download the project, clone the repository to your local machine using the following command:

git clone https://github.com/robingodinho/Airline_Reservation_System.git

Alternatively, you can download the project as a ZIP file from GitHub and extract it.

**Step 2: Open the Project in Your IDE**

For Eclipse:

- Open Eclipse.
- Go to File > Open Projects from File System....
- Click Directory..., and browse to the folder where you cloned or extracted the project.
- Click Finish to import the project into Eclipse.

For IntelliJ IDEA:

- Open IntelliJ IDEA.
- Go to File > Open.
- Navigate to the folder where the project was cloned or extracted and select it.
- IntelliJ will prompt you to import the project. Make sure to select the appropriate SDK if prompted.

**Step 3: Build the Project**
Make sure the project is built successfully:

- Eclipse: Right-click on the project in the Project Explorer and select Build Project.
- IntelliJ IDEA: It will automatically build the project, but you can go to Build > Build Project if needed.

**Step 4: Run the Java Program**
Once the project is successfully imported and built, follow these steps to run the Console class (the main entry point of the program):

Eclipse:

- Right-click on the Console.java file in the Package Explorer.
- Select Run As > Java Application.

IntelliJ IDEA:

- Open the Console.java file.
- Click on the green play button next to the main method, or go to Run > Run 'Console'.
The program will now start in the IDE’s console, allowing you to interact with the airline reservation system.
## Tech Stack

**Client:** Java



