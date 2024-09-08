## Loan Calculator

## Description

The **Loan Calculator** is a JavaFX application designed to compute monthly and total payments for a loan based on user-provided details. It provides a straightforward interface for users to input the annual interest rate, the number of years, and the loan amount. Upon clicking the "Calculate" button, the application displays the monthly payment and the total payment over the life of the loan.

## Features

- **Input Fields**:
    - **Annual Interest Rate**: Enter the annual interest rate as a percentage.
    - **Number of Years**: Enter the number of years for the loan.
    - **Loan Amount**: Enter the total amount of the loan.

- **Output Fields**:
    - **Monthly Payment**: Displays the calculated monthly payment.
    - **Total Payment**: Displays the total amount paid over the entire loan period.

- **Button**:
    - **Calculate**: Triggers the calculation of the monthly and total payments based on the entered data.

## Usage

1. **Input the Annual Interest Rate**: Enter the interest rate as a percentage (e.g., 5 for 5%).
2. **Input the Number of Years**: Enter the duration of the loan in years.
3. **Input the Loan Amount**: Enter the total amount of the loan.
4. **Click the Calculate Button**: The application will compute and display the monthly and total payments.

## Code Overview

- **`LoanCalculator` Class**: Extends `Application` from JavaFX and sets up the user interface and functionality.
    - **`start(Stage primaryStage)`**: Configures the layout, initializes input/output fields, and sets up the event handler for the calculate button.
    - **Event Handler**: Parses input values, performs calculations, and updates output fields.

## Dependencies

- JavaFX SDK (part of JDK 21)
- Java Development Kit (JDK 21)

## Running the Application

To run the Loan Calculator application:

1. Ensure you have JDK 21 and JavaFX SDK installed.
2. Compile the `LoanCalculator` class using your preferred IDE or command line.
3. Run the compiled class to launch the application window.

## Author

[nav7FSC on GitHub](https://github.com/nav7FSC)

