import java.util.*;
public class StockMaximize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> prices = new ArrayList<>();
        for(int i=0;i<n;i++){
            prices.add(sc.nextInt());
        }
        long profit = 0L;
        int max = prices.get(prices.size()-1);
        for(int i=prices.size()-2;i>=0;i--){
            if(prices.get(i)>max){
                max = prices.get(i);
            }
            else{
                profit+=max - prices.get(i);
            }
        }
        
        System.out.println(profit);
    }
}