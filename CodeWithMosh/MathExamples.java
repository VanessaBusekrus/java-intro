package CodeWithMosh;

public class MathExamples {
    public static void main(String[] args) {
        int result = Math.round(1.1F); // Rounds to the nearest integer
        System.out.println("round(1.1) = " + result);

        int result2 = (int) Math.ceil(1.1F); // Rounds up to the nearest integer
        System.out.println("ceil(1.1) = " + result2);

        int result3 = (int) Math.floor(1.9F); // Rounds down to the nearest integer
        System.out.println("floor(1.9) = " + result3);

        int result4 = Math.max(1, 2); // Returns the maximum of two numbers
        System.out.println("max(1,2) = " + result4);

        double result5 = Math.random(); // Returns a random number between 0.0 and 1.0
        System.out.println("random = " + result5);

        double result6 = Math.random() * 100; // Random number between 0.0 and 100.0
        System.out.println("random*100 = " + result6);

        int result7 = (int) (Math.random() * 100); // Random integer between 0 and 99
        System.out.println("random int = " + result7);
    }
}