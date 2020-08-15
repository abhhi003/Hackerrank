import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class RepeatedString
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        int len = s.length();
        long a=0;
        long res=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='a')
            a++;
        }
        long divisor=n/len;
        res+=divisor*a;
        for(int i=0;i<(n%len);i++)
        {
            if(s.charAt(i)=='a')
            res++;
        }
        System.out.println(res);
    }

}