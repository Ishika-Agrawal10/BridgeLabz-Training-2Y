
package Level2;
import java.util.*;
public class Operation2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d= a + b *c;
        double e= a * b + c;
        double f=c + a / b;
        double g=a % b + c;
        System.out.println("results of operation are "+d+","+ e+","+ f+","+ g);
        sc.close();
    }
}
