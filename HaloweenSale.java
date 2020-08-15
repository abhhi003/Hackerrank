import java.util.*;
class HaloweenSale
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int d=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();
        int price=p,cost=0,games=0;
        while(cost<=s)
        {
            //System.out.println("price : " + price);
            
                cost = cost + price;
                games++;
                price=Math.max(m, price-d);
            
            //System.out.println("cost : "+cost);
        }
        games--;
        System.out.println("games : " +games);
        
    }
}