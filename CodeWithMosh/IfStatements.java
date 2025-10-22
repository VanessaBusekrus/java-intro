package CodeWithMosh;

public class IfStatements {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        boolean hasMediumIncome = (income > 50_000 && income <= 100_000);
        if (hasHighIncome) {
            System.out.println("You are a high earner.");
        } else if (hasMediumIncome) {
            System.out.println("You are a medium earner.");
        } else
            System.out.println("You are a low earner.");
    }
}