import java.util.*;
public class Handshake {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double h=(double)((n * (n - 1)) / 2);
        System.out.println("possible number of handshake is "+h);
        sc.close();
    }
}
