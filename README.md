# Java OOP Task 2

This repository contains Java programs demonstrating fundamental Object-Oriented Programming (OOP) concepts such as encapsulation, inheritance, and class design. The project includes solutions to four tasks (1.1 to 1.4) that involve creating classes like `Person`, `Product`, `Account`, and an inheritance example with `Employee`.

## Project Structure

- **Person.java**: Implements a `Person` class with name and age properties (Task 1.1).
- **Person2.java**: Likely an updated or alternative version of the `Person` class.
- **Product.java**: Defines a `Product` class with a main class to handle product data (Task 1.2).
- **Account.java**: Implements an `Account` class with balance management (Task 1.3).
- **XYZ.java**: Contains inheritance example with `Person` and `Employee` classes (Task 1.4).
- **1.1.png, 1.2_a.png, 1.2_b.png, 1.3.png, 1.4.png**: Screenshots of the code implementations for each task.

## Tasks Overview

### Task 1.1: Person Class
- Creates a `Person` class with properties `name` and `age`.
- Default age is set to 18.
- Includes a constructor to initialize name and age, and a method to display them.

### Task 1.2: Product Class
- Defines a `Product` class with properties `pid`, `price`, and `quantity`.
- Includes a main class (`ProductMain`) that:
  - Accepts information for 5 products and stores them in an array.
  - Finds the product with the highest price.
  - Calculates the total amount spent on all products (price * quantity).

### Task 1.3: Account Class
- Implements an `Account` class with a `balance` property.
- Provides two constructors (default and parameterized).
- Includes methods to deposit, withdraw, and display the balance.

### Task 1.4: Inheritance with Person and Employee
- Defines a base class `Person` with `name` and `age`.
- Creates a subclass `Employee` that inherits from `Person` and adds `employeeID` and `salary`.
- Uses the `super` keyword to initialize `Person` attributes in the `Employee` constructor.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/thesoulseizure/task-2.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd task-2
   ```
3. **Compile the Java Files**:
   ```bash
   javac *.java
   ```
4. **Run the Desired Program**:
   - For Task 1.1: `java Person`
   - For Task 1.2: `java Product`
   - For Task 1.3: `java Account`
   - For Task 1.4: `java XYZ`

## Requirements

- Java Development Kit (JDK) 8 or higher.
- A terminal or IDE to compile and run Java programs.

## Screenshots

The repository includes screenshots (1.1.png to 1.4.png) that show the code implementations for each task. Refer to these images to view the solutions visually.
