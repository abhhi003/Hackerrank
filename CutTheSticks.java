import java.util.*;
class CutTheSticks
{
    static int getSmall(int[] a)
    {
        int res=0;
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                res = a[i];
                break;
            }       
        }
        return res;
    }
    static int check(int[] a)
    {
        int res=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                res=1;
            }
            else
            {
                res=0;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        List<Integer> al =new ArrayList<Integer>();
        while(check(a)==0)
        {
            int cut=getSmall(a);
            int count=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]>=cut)
                {
                    a[i]-=cut;
                    count++;
                }
            }
            al.add(count);
        }
        for(int x:al)
        {
            System.out.println(x);
        }
    }
}