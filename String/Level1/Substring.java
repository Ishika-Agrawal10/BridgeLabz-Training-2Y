package String.Level1;
import java.util.*;
public class Substring {

    public static String substringusingcharAt(String s,int start,int end){
        String result="";
        for(int i=start;i<end;i++){
            result +=s.charAt(i);
        }
        return result;
    }

    public static boolean comparingusingcharAt(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the strings,index values");
        String text=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        sc.close();
         String manualSub = substringusingcharAt(text, start, end);

        
        String builtInSub = text.substring(start, end);

        boolean m = comparingusingcharAt(manualSub, builtInSub);
        System.out.println("Substring using charAt(): " + manualSub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Comparison result: " + m);
        
    }
}
