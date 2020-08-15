import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int findDigit(int num)
    {
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        return count;
    }

    static int kaprekar(int n)
    {
        int res=0;
        long ln=Long.valueOf(n);
        long sq=ln*ln;
        int d=findDigit(n);
        String square = String.valueOf(sq);
        String l=square.substring(0, square.length()-d);
        String r=square.substring(square.length()-d);
        int l1=0;
        if(l.length()==0)
        {
            l1=0;
        }
        else
        {
            l1 = Integer.parseInt(l);
        }
        int temp=l1+Integer.parseInt(r);
        if(temp==n)
        {
            res=1;
        }
        return res;
    }
    static void kaprekarNumbers(int p, int q) 
    {
        List<Integer> al=new ArrayList<Integer>();
        for(int i=p;i<=q;i++)
        {
            if(kaprekar(i)==1)
            {
                al.add(i);
            }
        }
        if(al.size()==0)
        {
            System.out.println("INVALID RANGE");
        }
        else
        {
            for(int x:al)
            {
                System.out.print(x+" ");
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
