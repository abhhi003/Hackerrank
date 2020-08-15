import java.util.*;
class Pangrams{

    static String pangrams(String s) {
        s = s.toLowerCase();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)))
                freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
                return "not pangram";
            }
        }
        return "pangram";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(pangrams(s));
    }
}