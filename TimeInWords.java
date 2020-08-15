import java.util.*;
class TimesInWords
{
    static String convert(String s)
    {
        char[] num = s.toCharArray();
        int len=num.length;
        String ans="";
        String[] single_digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight","nine" };
        String[] two_digits = new String[] { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", 
                "eighteen", "nineteen" };
        String[] tens_multiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninety" };
        if(len==1)
        {
            ans=ans+single_digits[num[0]-'0'];
        }
        else
        {
            if(num[0]-'0'==1)
            {
                int sum=num[0]-'0'+num[1]-'0';
                ans=ans+two_digits[sum];
            }
            else if(num[0]-'0'==2 && num[1]-'0'==0)
            {
                ans="twenty";
            }
            else
            {
                int i=(num[0]-'0');
                ans=tens_multiple[i]+" "+single_digits[num[1] - '0'];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String h=sc.next();
        String m=sc.next();
        int min=Integer.parseInt(m);
        int hr = Integer.parseInt(h);
        String hh=convert(h);
        String mm=convert(m);
        if(min==0)
        {
            System.out.println(hh+" o' clock");
        }
        else if(min>=1 && min<=30)
        {
            if(min==15)
            {
                System.out.println("quarter past "+hh);
            }
            else if(min==30)
            {
                System.out.println("half past "+hh);
            }
            else if(min==1)
            {
                System.out.println(mm+" minute past "+hh);
            }
            else
            {
                System.out.println(mm+" minutes past "+hh);
            }
        }
        else if(min > 30 && min<60)
        {
            if(min==45)
            {
                System.out.println("quarter to "+ convert(String.valueOf(hr + 1)));
            }
            else
            {
                int remain = 60 - min;
                System.out.println(convert(String.valueOf(remain))+" minutes to "+convert(String.valueOf(hr+1)));
            }
        }
    }
}