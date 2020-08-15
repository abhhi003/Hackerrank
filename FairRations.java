import java.util.*;
class FairRations
{
    static int fairRations(int[] b)
    {
        int count=0;
        int odd=0;
        for (int i = 0; i < b.length; i++) 
        {
            if(b[i]%2!=0)
            {
                odd++;
            }
        }

        if (b.length>2 && odd%2==0)
        {
            for(int i=0;i<b.length-1;i++)
            {
                if (b[i]%2!=0)
                {
                    b[i]++;
                    b[i+1]++;
                    count+=2;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i =0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int res = fairRations(a);
        System.out.println(res);
    }
}