package CodeWithMosh;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);

        scanner.close();
    }
}