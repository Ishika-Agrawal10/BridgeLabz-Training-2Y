package Level2;
import java.util.*;
public class Triangle2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float base=sc.nextFloat();
        float height=sc.nextFloat();
        float area=(1*base*height)/2;
        float inch=(float)(area/(Math.pow(2.54,2)));
        float feet=(float)(area/(Math.pow(12,2)));
        System.out.println(" Your Height in cm is _"+height+" while in feet is ___ "+feet+ " and inches is ___"+inch);
        sc.close();
    }
}
