import java.util.*;

public class FunnyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String rev = sb.toString();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            int diff = Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
            a.add(diff);
        }
        
        for (int i = 0; i < rev.length() - 1; i++) {
            int diff = Math.abs((int) rev.charAt(i) - (int) rev.charAt(i + 1));
            b.add(diff);
        }

        String res = "Fuuny";
        for(int i=0;i<a.size();i++){
            if(a.get(i)!=b.get(i)){
                res = "Not Funny";
                break;
            }
        }

        System.out.println(res);
    }   
}