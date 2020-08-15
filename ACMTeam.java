import java.util.*;
class ACMTeam
{
    static int subCount(String s1,String s2)
    {
        int sub=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='1' || s2.charAt(i)=='1')
            {
                sub++;
            }
        }
        return sub;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = sc.next();
            topic[i] = topicItem;
        }
        List<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sub = subCount(topic[i],topic[j]);
                al.add(sub);
            }
        
        }
        
        Collections.sort(al);
        int sub = al.get(al.size()-1);
        int team=0;
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i)==sub)
            {
                team++;
            }
        }
        System.out.println(sub);
        System.out.println(team);
    }
}