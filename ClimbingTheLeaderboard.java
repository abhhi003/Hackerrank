import java.util.*;
class ClimbingTheLeaderboard
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int scores[] = new int[n];
        for(int i=0;i<n;i++)
        {
            scores[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int alice[] = new int[m];
        for(int i=0;i<m;i++)
        {
            alice[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++)
        {
            int num = scores[i];
            if (hm.containsKey(num))
                hm.put(num, hm.get(num) + 1);
            else
                hm.put(num, 1);
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i : hm.keySet())
        {
           al.add(i);
        }
        Collections.sort(al);
        for(int i=0;i<m;i++)
        {
            int rank=1;
            for(int j=0;j<al.size();j++)
            {
                if(alice[i]<al.get(j))
                {
                    rank++;
                }
            }
            System.out.println(rank);
        }
    }
}