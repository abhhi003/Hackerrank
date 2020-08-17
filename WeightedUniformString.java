import java.util.*;
public class WeightedUniformString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        Set<Integer> weight = new HashSet<>();
        char[] chArr = s.toCharArray();
        
        char prev=' ';
        int currentweight = 0;
        for(char ch : chArr){
            if(ch!=prev){
                currentweight = (int)ch - 96;
            }else{
                currentweight+= (int)ch - 96;
            }
            prev = ch;
            weight.add(currentweight);
        }

        //System.out.println(weight);

        String[] res = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String temp="No";
            if(weight.contains(arr[i])){
                res[i]="Yes";
            }
            else{
                res[i] = "No";
            }
        }
        System.out.println(Arrays.toString(res));
    }
}