package String.Level1;
import java.util.*;

public class CharArrayCheck {

    public static char[] getChars(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.next();
        sc.close();

        char[] userDefined = getChars(text);
        char[] builtIn = text.toCharArray();
        boolean areEqual = compareCharArrays(userDefined, builtIn);

        System.out.println("Characters using user-defined method: " + Arrays.toString(userDefined));
        System.out.println("Characters using toCharArray() method: " + Arrays.toString(builtIn));
        System.out.println("Comparison result: " + areEqual);
    }
}
