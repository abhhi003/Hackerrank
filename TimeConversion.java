import java.util.*;
class TimeConversion
{
    static String convert(String s)
    {
        int n = Character.getNumericValue(s.charAt(0)) * 10 + Character.getNumericValue(s.charAt(1));
        String str="";
        if (s.charAt(8)=='P')
        {
            if (n==12)
            {
                str="12";
            }
            else
            {
                n=n+12;
                str = String.valueOf(n);
            }

        }
        else
        {
            if (n == 12) 
            {
                str = "00";
            }
            else 
            {
                if(n<12)
                {
                    str = s.substring(0,2);
                }
                else
                {
                n = n - 12;
                str = String.valueOf(n);
            }
        }
        }
        return (str + s.substring(2, 8));
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = convert(s);
        System.out.println(res);
        sc.close();        
    }
}