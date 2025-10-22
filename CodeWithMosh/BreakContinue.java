package CodeWithMosh;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i is 5
            }
            System.out.println(i);
        }

        System.out.println("-----");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println(i);
        }
    }
}