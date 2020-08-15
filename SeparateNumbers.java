import java.util.*;

class SeparateNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res="NO";
        for(int i=1;i<=s.length()/2;i++){
            String sub = s.substring(0,i);
            long first = Long.parseLong(sub);
            long temp=first;
            System.out.println(temp);
            while(sub.length()<s.length()){
                temp = temp + 1;
                sub+=Long.valueOf(temp);
                
                System.out.println(sub);
            }

            if(sub.equals(s)){
                res = "YES " + first;
                break;
            }
        }
        if(s.charAt(0)=='0'){
            res="NO";
        }
        System.out.println(res);
    }
}