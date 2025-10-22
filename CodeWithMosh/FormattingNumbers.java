package CodeWithMosh;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println("currency: " + result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println("percent: " + result2);

        // Method chaining
        String result3 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println("percent (chained): " + result3);
    }
}