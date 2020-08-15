import java.util.*;
class PickingNumbers
{
    static int check(List<Integer> a)
    {
        int ans=0;
        int n = a.size();
        int[] b = new int[100];
        for(int i=0;i<n;i++)
        {
            b[a.get(i)]++;
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                int left=0;int right=0;
                if(j-i==1)
                {
                     left = b[i]+b[j];
                }
                else
                {
                    left = b[i];
                }

                if (i - j == 1) {
                     right = b[i] + b[j];
                } else {
                    right = b[i];
                }
                if (left > ans)
                    ans = left;
                if (right > ans)
                    ans = right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        int result = check(a);
        System.out.println(result);
    }
}