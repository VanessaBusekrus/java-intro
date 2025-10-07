package MortgageCalculator;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        // Mortgage Calculator
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        System.out.print("Principal ($1K - $1M): ");
        int principal;
        while (true) {
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000.");
        }       

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate;
        while (true) {
            annualInterestRate = scanner.nextFloat();
            if (annualInterestRate > 0 && annualInterestRate <= 30)
                break;
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Years: ");
        byte years;
        while (true) {
            years = scanner.nextByte();
            if (years >= 1 && years <= 30)
                break;
            System.out.println("Enter a value between 1 and 30.");
        }
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = (principal * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        scanner.close();
    }
}