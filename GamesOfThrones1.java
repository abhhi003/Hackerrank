import java.util.*;

public class GamesOfThrones1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        int odd=0;
        for(int i=0;i<26;i++)
        {
            if(freq[i] % 2 !=0)
            {
                odd++;
            }
        }
        if(odd<1)
        {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}