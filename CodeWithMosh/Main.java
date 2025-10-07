package CodeWithMosh;


/* Primitive Types */

// class Main {
//     public static void main(String[] args) {
//         byte myAge = 35;
//         long viewsCount = 3_123_456_789L; // Using underscore for better readability
//         float price = 10.99F;
//         char letter = 'A';
//         boolean isEligible = false;
//     }
// }

/* ------------------------------------------------------------------- */
/* Reference Types */

// import java.util.Date;


// public class Main {

//     public static void main(String[] args) {
//         Date now = new Date(); // creating an object (instance) of Date class

//         // System.out.println(now);
//         System.out.println(now);
//     }
// }

// import java.awt.Point;

// public class Main {

//     public static void main(String[] args) {
//         // Primitive types
//         // int x = 1;
//         // int y = x; // y is a copy of x
//         // y = 2;
//         // System.out.println(x); // Outputs 1
//         // System.out.println(y); // Outputs 2

//         // Reference types
//         Point point1 = new Point(1, 1);
//         Point point2 = point1; // point2 references the same object as point1
//         point2.x = 2;
//         System.out.println(point1); // Outputs Point{x=2, y=1}
//         System.out.println(point2); // Outputs Point{x=2, y=1}
//     }
// }

/* ------------------------------------------------------------------- */
/* Strings */

// public class Main {
//     public static void main(String[] args) {
//         String message = "Hello World" + "!!";
//         System.out.println(message.endsWith("!!"));
//         System.out.println(message.startsWith("!!"));
//         System.out.println(message.length());
//         System.out.println(message.indexOf("World"));
//         System.out.println(message.replace("!", "*"));
//         System.out.println(message.toLowerCase());
//         System.out.println(message.toUpperCase());
//         System.out.println(message.trim());
//     }
// }

/* ------------------------------------------------------------------- */
/* Arrays */

// import java.util.Arrays; // Importing the Arrays utility class

// public class Main {
//     public static void main(String[] args) {
//         int[] numbers = {2, 3, 4, 5, 6};

//         System.out.println(numbers.length); // This will print the length of the array
//         System.out.println(Arrays.toString(numbers)); // This will print the contents of the sorted array
//         Arrays.sort(numbers); // This will sort the array in place
//         System.out.println(numbers); // This will print the memory reference, not the contents
//     }
// }  

/* ------------------------------------------------------------------- */
/* Multi-Dimensional Arrays */

// import java.util.Arrays; // Importing the Arrays utility class

// public class Main {
//     public static void main(String[] args) {
//         int[][] numbers = {
//             {1, 2, 3},
//             {4, 5, 6}
//         };

//         System.out.println(numbers.length); // This will print the number of rows in the array
//         System.out.println(Arrays.deepToString(numbers)); // This will print the contents of the multi-dimensional array
//     }
// }

/* ------------------------------------------------------------------- */
/* Constants */

// public class Main {
//     public static void main(String[] args) {
//         final float PI = 3.14F; // Constant variable because of 'final' keyword
//         // PI is a constant and cannot be changed once assigned
//         // PI = 1; // This will cause a compilation error because PI is final
//         System.out.println(PI);
//     }
// }

/* ------------------------------------------------------------------- */
/* Type Casting */

// public class Main {
//     public static void main(String[] args) {
//         // Implicit Casting (Widening)
//         short x = 1;
//         int y = x + 2; // short is implicitly cast to int
//         System.out.println(y);

//         // Explicit Casting (Narrowing)
//         double a = 1.1;
//         int b = (int) a + 2; // double is explicitly cast to int
//         System.out.println(b);

//         // Converting String to int
//         String s = "1";
//         int c = Integer.parseInt(s) + 2; // Converting String to int
//         System.out.println(c);
//     }
// }

/* ------------------------------------------------------------------- */
/* Math class */

// public class Main {
//     public static void main(String[] args) {
//         int result = Math.round(1.1F); // Rounds to the nearest integer
//         System.out.println(result);

//         int result2 = (int) Math.ceil(1.1F); // Rounds up to the nearest integer
//         System.out.println(result2);

//         int result3 = (int) Math.floor(1.9F); // Rounds down to the nearest integer
//         System.out.println(result3);

//         int result4 = Math.max(1, 2); // Returns the maximum of two numbers
//         System.out.println(result4);

//         double result5 = Math.random(); // Returns a random number between 0.0 and 1.0. Returns a double value
//         System.out.println(result5);

//         double result6 = Math.random() * 100; // Random number between 0.0 and 100.0
//         System.out.println(result6);

//         int result7 = (int) (Math.random() * 100); // Random integer between 0 and 99
//         System.out.println(result7);
//     }
// }

/* ------------------------------------------------------------------- */
/* Formatting Numbers */
// import java.text.NumberFormat; // Importing the NumberFormat class

// public class Main {
//     public static void main(String[] args) {
//         NumberFormat currency = NumberFormat.getCurrencyInstance(); // Getting a currency formatter. Factory method!
//         String result = currency.format(1234567.891); // Formatting a number as currency
//         System.out.println(result); // Outputs the formatted currency string

//         NumberFormat percent = NumberFormat.getPercentInstance(); // Getting a percentage formatter
//         String result2 = percent.format(0.1); // Formatting a number as a percentage
//         System.out.println(result2); // Outputs the formatted percentage string

//         // Method chaining
//         String result3 = NumberFormat.getPercentInstance().format(0.1);
//         System.out.println(result3);
//     }
// }

/* ------------------------------------------------------------------- */
/* Reading Input from Console */

// import java.util.Scanner; // Importing the Scanner class

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the console

//         // System.out.print("Age: "); // Prompting the user for their age
//         // byte age = scanner.nextByte(); // Reading a byte value from the console
//         // System.out.println("You are " + age); // Displaying the user's age. Java will convert byte to string automatically

//         System.out.print("Name: "); // Prompting the user for their name
//         String name = scanner.nextLine().trim(); // Reading a string value from the console. Using nextLine() to capture the entire line and trim() to remove leading/trailing whitespace
//         System.out.println("You are " + name); // Displaying the user's name

//         scanner.close(); // Closing the scanner to prevent resource leaks
//     }
// }

/* ------------------------------------------------------------------- */
/* Simplifying if Statements */

// public class Main {
//     public static void main(String[] args) {
//         int income = 120_000;
//         boolean hasHighIncome = (income > 100_000); // Simplified if statement
//         boolean hasMediumIncome = (income > 50_000 && income <= 100_000);
//         if (hasHighIncome) {
//             System.out.println("You are a high earner.");
//         }
//         else if (hasMediumIncome) {
//             System.out.println("You are a medium earner.");
//         } 
//         else
//             System.out.println("You are a low earner.");
//     }
// }

/* ------------------------------------------------------------------- */
/* Switch Statements */

// public class Main {
//     public static void main(String[] args) {
//         String role = "admin";

//         switch (role) {
//             case "admin":
//                 System.out.println("You are an admin.");
//                 break;
//             case "moderator":
//                 System.out.println("You are a moderator.");
//                 break;
//             default:
//                 System.out.println("You are a guest.");
//         }
//     }
// }

/* ------------------------------------------------------------------- */
/* Ternary Operator */

// public class Main {
//     public static void main(String[] args) {
//         int income = 120_000;
//         String className = income > 100_000 ? "First" : "Economy"; // Ternary operator to assign className based on income
//         System.out.println(className); // Outputs "First" if income > 100,000, otherwise "Economy"
//     }
// }

/* ------------------------------------------------------------------- */
/* For loop */

// public class Main {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Hello World " + i);
//         }
//     }
// }

/* ------------------------------------------------------------------- */
/* While loop */

// public class Main {
//     public static void main(String[] args) {
//         int i = 1;
//         while (i <= 5) {
//             System.out.println("Hello World " + i);
//             i++;
//         }
//     }
// }

/* ------------------------------------------------------------------- */
/* Do while loop */

// public class Main {
//     public static void main(String[] args) {
//         int i = 1;
//         do {
//             System.out.println("Hello World " + i);
//             i++;
//         } while (i <= 5);
//     }
// }

/* ------------------------------------------------------------------- */
/* For-Each loop */

// public class Main {
//     public static void main(String[] args) {
//         String[] fruits = {"Apple", "Mango", "Orange"};
//         for (String fruit : fruits) {
//             System.out.println(fruit);
//         }
//     }
// }

/* ------------------------------------------------------------------- */
/* Break and Continue */

public class Main {

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