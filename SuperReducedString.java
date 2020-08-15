import java.util.*;
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i=0;
        int len = s.length();
        while(i<len-1){
            if(s.charAt(i) == s.charAt(i+1)){
                s=s.substring(0, i) + s.substring(i+2);
                len = s.length();
                i=0;
            }
            else{
                i++;
            }
        }
        if(s.length()==0)
        {
            System.out.println("Empty String");
        }else{
            System.out.println(s);
        }
    }
}