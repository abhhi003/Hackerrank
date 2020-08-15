import java.util.*;

public class Anagram {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int res = 0;
        if(s.length()%2!=0)
        {
            res=-1;
        }
        else
        {
            String a = s.substring(0,s.length()/2);
            String b = s.substring(s.length()/2);
            int[] first = new int[26];
            int[] second = new int[26];
            for(int i=0;i<a.length();i++)
            {
                first[a.charAt(i) - 'a']++;
            }
            for(int i=0;i<b.length();i++)
            {
                second[b.charAt(i) - 'a']++;
            }
            for(int i=0;i<26;i++)
            {
                res+= Math.abs(first[i] - second[i]);
            }
            res/=2;
        }
        System.out.println(res);
    }    
}