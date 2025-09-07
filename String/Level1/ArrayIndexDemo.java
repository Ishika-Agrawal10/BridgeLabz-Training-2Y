package String.Level1;
import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[10]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names: ");
        int size = sc.nextInt();
        sc.nextLine();
        String[] names = new String[size];
        System.out.println("Enter " + size + " names: ");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }
        sc.close();

        System.out.println("---- Generating Exception ----");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException(): " + e);
        }

        System.out.println("---- Handling Exception ----");
        handleException(names);
    }
}

