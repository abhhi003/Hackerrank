import java.util.*;
public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        String msg = "SOS";
        for(int i=0;i<s.length()-2;i+=3){
            String temp = s.substring(i, i+3);
            for(int j=0;j<3;j++){
                if(temp.charAt(j)!=msg.charAt(j)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}