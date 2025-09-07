package String.Level1;
import java.util.*;
public class Comaringtwostring {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two strings for comparsion");
        String a=sc.nextLine();
        String b=sc.nextLine();
        int i;
        String c="";
        String d="";
        sc.close();
        for(i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i) == b.charAt(j)){
                  c="True";
                }
            }

        }
        if (a.equals(b)){
            d="True";
        }
        if (c==d){
            System.out.println("Two string are equal");
        }
        else{
            System.out.println("strings are not equal");
        }
    }
}
