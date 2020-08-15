import java.util.*;
public class SherlockAndValidString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i),1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i : hm.values()){
            set.add(i);
        }
        String res="";
        if(set.size() == 1)
        {
            res="YES";
        }
        else if(set.size()>2)
        {
            res="NO";
        }
        else{
            int f1 = 0;
            int f2 = 0;
            int f1Count = 0;
            int f2Count = 0;
            int i = 0;
            for (int n : set) {
                if (i == 0)
                    f1 = n;
                else
                    f2 = n;
                i++;
            }

            for (int freq : hm.values()) {
                if (freq == f1)
                    f1Count++;
                if (freq == f2)
                    f2Count++;
            }

            if ((f1 == 1 && f1Count == 1) || (f2 == 1 && f2Count == 1))
                res="YES";
            else if ((Math.abs(f1 - f2) == 1) && (f1Count == 1 || f2Count == 1))
                res="YES";
            else
                res="NO";
        }
        System.out.println(res);

    }
}