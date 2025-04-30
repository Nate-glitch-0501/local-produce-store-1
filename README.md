# Local Produce Store

## Overview
The Local Produce Store project is a Java application designed to manage a local produce store's inventory and shopping cart functionalities. It allows users to interact with products, manage their shopping carts, and apply discounts to their purchases.

## Project Structure
```
local-produce-store
├── src
│   ├── Main.java
│   ├── domain
│   │   ├── Inventory.java
│   │   ├── Product.java
│   │   ├── ShoppingCart.java
│   │   └── interfaces
│   │       └── Discountable.java
├── .gitignore
└── README.md
```

## Files Description
- **src/Main.java**: The entry point of the application. It contains the main method which initializes the application and includes logic to interact with the inventory and shopping cart.
  
- **src/domain/Inventory.java**: Manages a collection of Product objects. It includes methods to add, remove, and retrieve products, demonstrating encapsulation through private fields.

- **src/domain/Product.java**: Represents a product in the store with fields for product ID, name, price, and quantity. It provides public getters and setters for these fields.

- **src/domain/ShoppingCart.java**: Represents a shopping cart that holds products selected by the user. It includes methods to add, remove, and calculate the total price of items in the cart, demonstrating encapsulation.

- **src/domain/interfaces/Discountable.java**: An interface that defines a method for applying discounts to products. Classes implementing this interface must provide their own logic for calculating discounts, demonstrating polymorphism.

## Features
- Sorting (Selection Sort, Insertion Sort)
- Searching (Linear Search, Binary Search)
- Exception Handling (NegativePriceException)
- Performance Measurement

## How to Run
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Clone the repository or download the project files.
3. Navigate to the project directory in your terminal.
4. Compile the Java files using the command:
   ```
   javac src/Main.java src/domain/*.java src/domain/interfaces/*.java
   ```
5. Run the application with the command:
   ```
   java src.Main
   ```

## Dependencies
- Java JDK (version 8 or higher recommended)

## Contributors
- Karabo Zoe Kula 202406163
- Bubelebenkosi Nathaniel Dube 202406089
- Theo Shawn Thakadu 202002374
- Utlwang Utlwang 202003747
- Kyle Theo Skosana Masilonyane 202401193

## .gitignore
This project includes a `.gitignore` file to exclude compiled class files and IDE-specific files from version control.
