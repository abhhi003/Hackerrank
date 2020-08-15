import java.util.*;
class EqualizeArray
{
    static int equalizeArray(int[] arr) 
    {
        int temp[]=new int[101];
        for(int i=0;i<arr.length;i++)
        {
            temp[arr[i]]++;
        }
        Arrays.sort(temp);
        int res=0;
        for(int i=0;i<temp.length-1;i++)
        {
            res=res+temp[i];
        }
    return res;

    }
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int ans=equalizeArray(a);
        System.out.println(ans);     
    }
}