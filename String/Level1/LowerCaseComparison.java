
package String.Level1;

import java.util.Scanner;

public class LowerCaseComparison {

    public static String toLowerCaseUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = sc.nextLine();
        sc.close();

        String userDefinedLower = toLowerCaseUsingCharAt(input);
        String builtInLower = input.toLowerCase();

        boolean areEqual = compareStrings(userDefinedLower, builtInLower);

        System.out.println("Lowercase using charAt(): " + userDefinedLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Are both results equal? " + areEqual);
    }
}

