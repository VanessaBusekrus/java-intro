package CodeWithMosh;

public class StringsExample {
    public static void main(String[] args) {
        String message = "Hello World" + "!!";
        System.out.println("endsWith(!!): " + message.endsWith("!!"));
        System.out.println("startsWith(!!): " + message.startsWith("!!"));
        System.out.println("length: " + message.length());
        System.out.println("indexOf World: " + message.indexOf("World"));
        System.out.println("replace: " + message.replace("!", "*"));
        System.out.println("toLower: " + message.toLowerCase());
        System.out.println("toUpper: " + message.toUpperCase());
        System.out.println("trim: '" + message.trim() + "'");
    }
}