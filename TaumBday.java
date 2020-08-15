import java.util.*;
class TaumBday
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int b = sc.nextInt();
            int w= sc.nextInt();
            int bc=sc.nextInt();
            int wc=sc.nextInt();
            int z=sc.nextInt();
            int cost=0;
            long minBlackPrice = Math.min(bc, wc + z);
            
            
            long minWhitePrice = Math.min(wc, bc + z);
            
            
            System.out.println((minBlackPrice * b) + (minWhitePrice * w));
        }
    }
}