package String.Level1;

import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate the exception (no handling here)
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // will throw NumberFormatException if not numeric
        System.out.println("Converted number: " + number);
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println("---- Generating Exception ----");
        try {
            generateException(input); // will throw exception if not numeric
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("---- Handling Exception ----");
        handleException(input);
    }
}
