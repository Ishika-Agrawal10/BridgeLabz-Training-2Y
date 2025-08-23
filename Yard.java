import java.util.*;
public class Yard {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the distance/height in feets");
        double height=sc.nextDouble();
        double yard=height/3;
        double mile=yard/1760;
System.out.println("the distance in feet is "+height+" in yard is "+yard+" in mile"+ mile);
sc.close();
    }
}
