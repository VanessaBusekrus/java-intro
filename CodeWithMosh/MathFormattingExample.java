package CodeWithMosh;

import java.text.NumberFormat;

public class MathFormattingExample {
    public static void main(String[] args) {
        // Demonstrates Math and NumberFormat together
        System.out.println("round(1.1) = " + Math.round(1.1F));
        System.out.println("ceil(1.1) = " + (int) Math.ceil(1.1F));

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println("currency: " + currency.format(1234567.891));
    }
}