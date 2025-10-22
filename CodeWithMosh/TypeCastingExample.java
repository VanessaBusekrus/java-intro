package CodeWithMosh;

public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit Casting (Widening)
        short x = 1;
        int y = x + 2; // short is implicitly cast to int
        System.out.println(y);

        // Explicit Casting (Narrowing)
        double a = 1.1;
        int b = (int) a + 2; // double is explicitly cast to int
        System.out.println(b);

        // Converting String to int
        String s = "1";
        int c = Integer.parseInt(s) + 2; // Converting String to int
        System.out.println(c);
    }
}