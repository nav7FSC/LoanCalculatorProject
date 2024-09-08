package org.education.loancalculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoanCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Created a heading
        Label lblHeading = new Label("Loan Calculator");
        lblHeading.setFont(new Font("Arial", 24)); // Set the font size for the heading
        lblHeading.setPadding(new Insets(10, 0, 20, 0)); // Add space around the heading

        // Created labels and input fields
        Label lblInterestRate = new Label("Annual Interest Rate:");
        TextField tfInterestRate = new TextField();

        Label lblYears = new Label("Number of Years:");
        TextField tfYears = new TextField();

        Label lblLoanAmount = new Label("Loan Amount:");
        TextField tfLoanAmount = new TextField();

        // Created labels and output fields
        Label lblMonthlyPayment = new Label("Monthly Payment:");
        TextField tfMonthlyPayment = new TextField();
        tfMonthlyPayment.setEditable(false); // Read-only input field

        Label lblTotalPayment = new Label("Total Payment:");
        TextField tfTotalPayment = new TextField();
        tfTotalPayment.setEditable(false); // Read-only input field

        // Created the Calculate button
        Button btnCalculate = new Button("Calculate");
        btnCalculate.setStyle("-fx-background-color: blue; -fx-text-fill: white;"); // Button color blue

        // Setting up the layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(5); // Vertical spacing
        gridPane.setHgap(5); // Horizontal spacing

        // Adding all elements to the grid
        gridPane.add(lblHeading, 0, 0, 2, 1);
        gridPane.add(lblInterestRate, 0, 1);
        gridPane.add(tfInterestRate, 1, 1);
        gridPane.add(lblYears, 0, 2);
        gridPane.add(tfYears, 1, 2);
        gridPane.add(lblLoanAmount, 0, 3);
        gridPane.add(tfLoanAmount, 1, 3);
        gridPane.add(lblMonthlyPayment, 0, 4);
        gridPane.add(tfMonthlyPayment, 1, 4);
        gridPane.add(lblTotalPayment, 0, 5);
        gridPane.add(tfTotalPayment, 1, 5);
        gridPane.add(btnCalculate, 1, 6);

        // Creating a scene and set it on the stage
        Scene scene = new Scene(gridPane, 438, 313); // Size of the window
        primaryStage.setTitle("Loan Calculator"); // Title of the window
        primaryStage.setScene(scene); // Adding scene to the window
        primaryStage.show(); // Displaying the window

        // Defining what happens when the Calculate button is clicked
        btnCalculate.setOnAction(e -> {
            double interestRate = Double.parseDouble(tfInterestRate.getText()); // Getting the interest rate from the input
            int years = Integer.parseInt(tfYears.getText()); // Getting the number of years from the input
            double loanAmount = Double.parseDouble(tfLoanAmount.getText()); // Getting the loan amount from the input

            // Calculating the monthly and the total payments
            double monthlyInterestRate = interestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate /
                    (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
            double totalPayment = monthlyPayment * years * 12;

            // Shows results of output field
            tfMonthlyPayment.setText(String.format("$%.2f", monthlyPayment));
            tfTotalPayment.setText(String.format("$%.2f", totalPayment));
        });
    }

    public static void main(String[] args) {
        launch(args); // Runs the app
    }
}
