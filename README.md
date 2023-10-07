Vehicle Rental Agency
Welcome to the Vehicle Rental Agency project! This application allows vehicle agents to manage and book available vehicles for customers.

Features
Use Case #1: Add a New Vehicle
Trigger: Click the "Add a new Vehicle" link on the home page.
Functionality: Allows users to add a new vehicle to the database.
UI Form: Includes fields for registration number, vehicle category, manufacturer, daily rent, mileage, fuel type, description, save button, and cancel button.
Validation: Validates input data, generates a unique identifier for the vehicle, and handles exceptions.
Result: Displays a success message upon saving the vehicle.
Use Case #2: Book a Vehicle
Trigger: Click the "Book a Vehicle" link on the home page.
Functionality: Enables users to book a vehicle for rental.
UI Form: Consists of fields for customer name, vehicle category, vehicle registration number (filtered by category), booking dates, total rent calculation, payment receipt, save button, and cancel button.
Validation: Ensures all form fields are filled, generates a unique booking identifier, prevents double-booking of the same vehicle, and handles exceptions.
Result: Displays a success message when the booking is saved, or appropriate error messages.
Use Case #3: Vehicle Booking Report
Trigger: Click on the "Vehicle Booking Report" link on the home page.
Functionality: Provides a report of vehicles booked in the current month.
UI Display: Shows a table with vehicle types, total available vehicles, total rented vehicles, and total rent earned.
Data Handling: Accounts for rentals spanning multiple months.
Result: Displays the report and allows users to return to the home page.
Usage
Clone this repository.
Configure your database settings.
Build and run the application.
Access the application through your web browser.
Assumptions
Single-user system (no authentication).
Proper data types and exception handling.
Provided API documents and no internet usage.
Additional fields exist in the database tables.
Contributing
Feel free to contribute to this project by forking the repository and creating pull requests for improvements.

License
This project is licensed under the MIT License.
