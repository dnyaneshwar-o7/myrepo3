package PracticelevelQuestions;

import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double amount;
        String fromCurrency, toCurrency;
        double convertedAmount = 0;

        System.out.println("Welcome to Currency Converter");

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter currency to convert from (INR/USD/EUR): ");
        fromCurrency = sc.nextLine().toUpperCase();

        System.out.print("Enter currency to convert to (INR/USD/EUR): ");
        toCurrency = sc.nextLine().toUpperCase();

        // Example static exchange rates
        double inrToUsd = 0.012;
        double usdToInr = 83.2;
        double inrToEur = 0.011;
        double eurToInr = 91.5;

        if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            convertedAmount = amount * inrToUsd;
        } else if (fromCurrency.equals("USD") && toCurrency.equals("INR")) {
            convertedAmount = amount * usdToInr;
        } else if (fromCurrency.equals("INR") && toCurrency.equals("EUR")) {
            convertedAmount = amount * inrToEur;
        } else if (fromCurrency.equals("EUR") && toCurrency.equals("INR")) {
            convertedAmount = amount * eurToInr;
        } else if (fromCurrency.equals(toCurrency)) {
            convertedAmount = amount; // same currency
        } else {
            System.out.println("Conversion rate not available.");
            System.exit(0);
        }

        System.out.printf("Converted amount: %.2f %s\n", convertedAmount, toCurrency);
        sc.close();
    }
}
