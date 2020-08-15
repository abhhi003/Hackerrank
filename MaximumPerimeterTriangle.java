import java.util.*;

public class MaximumPerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] sticks = new long[n];
        for(int i=0;i<n;i++){
            sticks[i] = sc.nextLong();
        }
        Arrays.sort(sticks);
        long perimeter = 0;
        int index=0;
        for(int i=0;i<sticks.length-2;i++){
            long temp=0;
            long a = sticks[i];
            long b = sticks[i+1];
            long c = sticks[i+2];
            
            if(c>=b && b>=a){
                if(a+b > c){
                    temp = a+b+c;
                    
                }
                if(temp > perimeter){
                    perimeter = temp;
                    index = i;
                    
                }
            }
        }
        if(perimeter==0){
            System.out.println("-1");
        }else{
            System.out.println(sticks[index] + " " + sticks[index + 1] + " " + sticks[index + 2]);
        }
       
    }    
}