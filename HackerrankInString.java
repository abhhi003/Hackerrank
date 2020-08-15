import java.util.*;


public class HackerrankInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String temp = "hackerrank";
        int index = 0;
        String res = "NO";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == temp.charAt(index)){
                index++;
            }
    
       
        if(index == temp.length()){
            res="YES";
        }
    }
        System.out.println(res);
    }
}