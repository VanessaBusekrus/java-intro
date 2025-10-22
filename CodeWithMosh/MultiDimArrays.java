package CodeWithMosh;

import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("rows: " + numbers.length);
        System.out.println("contents: " + Arrays.deepToString(numbers));
    }
}