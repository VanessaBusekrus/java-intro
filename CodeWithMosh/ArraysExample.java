package CodeWithMosh;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4, 5, 6};

        System.out.println("length: " + numbers.length);
        System.out.println("toString: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("sorted: " + Arrays.toString(numbers));
        System.out.println("array reference: " + numbers);
    }
}