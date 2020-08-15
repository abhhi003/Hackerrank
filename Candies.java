import java.util.*;
public class Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int[] candies = new int[n];
        candies[0] = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                candies[i] = candies[i-1]+1;
            }
            if (arr[i] <= arr[i - 1]){
                candies[i]=1;
            }
        }
        

        for(int i=n-1;i>0;i--){
            if(arr[i]<arr[i-1]){
                candies[i-1] = Math.max(candies[i-1],candies[i]+1);
            }

        }

        long res=0;
        for(int x : candies){
            res+=x;
        }
        //System.out.println(Arrays.toString(candies));
        System.out.println(res);
    }
}