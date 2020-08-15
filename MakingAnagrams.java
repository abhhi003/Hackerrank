import java.util.*;

class MakingAnagrams{

    public static Set<Character> stringToSet(String s){
        Set<Character> res = new HashSet<>(26);
        for(char c : s.toCharArray()){
            res.add(Character.valueOf(c));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int count=0;
        int[] first = new int[26];
        int[] second = new int[26];
        for(int i=0;i<s1.length();i++)
        {
            first[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            second[s2.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++)
        {
            count+=Math.abs(first[i] - second[i]);
        }
        System.out.println(count);
    }
}