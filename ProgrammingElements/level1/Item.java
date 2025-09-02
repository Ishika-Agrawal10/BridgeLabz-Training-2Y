package level1;
import java.util.*;
public class Item {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter the quantity and unit price of an item");
        int q= sc.nextInt();
        int u=sc.nextInt();
        int tp=q*u;
        System.out.println("the total prime of an item is "+tp+" while quantity is "+q+"unit price is"+u);
        sc.close();
    }
}
