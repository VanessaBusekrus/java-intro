package MortgageCalculator;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int principal = readInt(scanner, "Principal ($1K - $1M): ", 1_000, 1_000_000);
        float annualInterestRate = readFloat(scanner, "Annual Interest Rate: ", 0, 30);
        byte years = (byte) readInt(scanner, "Years: ", 1, 30);

        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = (principal * monthlyInterestRate)
                / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
        scanner.close();
    }

    private static int readInt(Scanner scanner, String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value >= min && value <= max)
                    return value;
            } else {
                scanner.next();
            }
            System.out.printf("Enter a value between %,d and %,d.%n", min, max);
        }
    }

    private static float readFloat(Scanner scanner, String prompt, float min, float max) {
        float value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextFloat()) {
                value = scanner.nextFloat();
                if (value > min && value <= max)
                    return value;
            } else {
                scanner.next();
            }
            System.out.printf("Enter a value greater than %.2f and less than or equal to %.2f.%n", min, max);
        }
    }
}