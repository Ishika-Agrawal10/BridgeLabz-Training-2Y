package Level2;
import java.util.*;
public class Question {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int d=number1/number2;
        int q=number1%number2;
        System.out.println(" The Quotient is ___"+d+ " and Reminder is ___"+q+ " of two number ___ "+number1+"and _"+number2);
        sc.close();
        
    }
}
