# Pharmacy Management System

## Overview
The Pharmacy Management System is a simple console-based Java application designed to manage a pharmacy's inventory. It allows users to add medicines, view the inventory, and sell medicines while ensuring stock updates accordingly.

## Features
- Add medicines to the inventory.
- Display the list of available medicines.
- Sell medicines and update stock levels.
- Prevents selling when stock is insufficient.
- User-friendly menu-driven interface.

## Technologies Used
- Java
- Object-Oriented Programming (OOP)

## Installation and Usage
### Prerequisites
- Java Development Kit (JDK) installed.
- A Java-compatible IDE or terminal.

### Steps to Run
1. Clone or download the project files.
2. Open the project in an IDE or navigate to the folder in a terminal.
3. Compile the Java files:
   ```sh
   javac Main.java PharmacyManagementSystem.java
   ```
4. Run the application:
   ```sh
   java Main
   ```

## Class Structure
### `Medicine` Class
- Attributes: `name`, `quantity`, `price`
- Methods: `getName()`, `getQuantity()`, `getPrice()`, `updateQuantity()`, `toString()`

### `Pharmacy` Class
- Manages a list of `Medicine` objects.
- Methods: `addMedicine()`, `displayMedicines()`, `sellMedicine()`

### `PharmacyManager` Class
- Manages a list of `Drug` objects.
- Methods: `addDrug()`, `updateDrug()`, `displayInventory()`

### `Main` Class
- Provides a menu-driven interface for users.
- Handles user input and manages the pharmacy operations.

## Future Enhancements
- Implement a graphical user interface (GUI).
- Integrate a database for persistent storage.
- Add user authentication and role management.

## Author
- **Nithish**

## License
This project is licensed under the MIT License.

