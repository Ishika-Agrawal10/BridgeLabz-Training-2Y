package String.Level1;

import java.util.Scanner;

public class StringIndexDemo {

    public static void generateException(String text) {
        
        System.out.println("Character at position 100: " + text.charAt(100));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at position 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String input = sc.nextLine();
        sc.close();

        System.out.println("---- Generating Exception ----");
        try {
            generateException(input); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("---- Handling Exception ----");
        handleException(input);
    }
}
