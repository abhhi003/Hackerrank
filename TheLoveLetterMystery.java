import java.util.*;

public class TheLoveLetterMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        int j=s.length()-1;
        int i=0;
        while(i<j){
            count = Math.abs(s.charAt(i) - s.charAt(j));
            i++;j--;
        }
        System.out.println("count : "+count);
    }    
}