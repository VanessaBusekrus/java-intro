package CodeWithMosh;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte myAge = 35;
        long viewsCount = 3_123_456_789L; // Using underscore for better readability
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        System.out.println("age=" + myAge + ", views=" + viewsCount + ", price=" + price + ", letter=" + letter + ", eligible=" + isEligible);
    }
}