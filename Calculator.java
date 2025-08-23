import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float number1 = sc.nextFloat();
        float number2 = sc.nextFloat();
        float c = number1 + number2;
        float d = number1 - number2;
        float e = number1 * number2;
        float f = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers=" + number1
                + " and" + number2 + " is" + c + "," + d + "," + e + "," + f);
        sc.close();
    }
}
