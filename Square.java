import java.util.*;
public class Square {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the perimeter of the square");
        int perimeter=sc.nextInt();
        int a=perimeter/4;
        System.out.println("The length of the side is ___"+a+ " whose perimeter is _"+perimeter);
                    
        sc.close();
    }
}
