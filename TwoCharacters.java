import java.util.*;
class TwoCharacters{
    static boolean alternate(String s){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        List<Character> al = new ArrayList<>(set);
        int res = 0 ;
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.size();j++){
                char c1 = al.get(i);
                char c2 = al.get(j);
                String substring = s.replaceAll("[^" + c1 + "" + c2 + "]","");
                int len = substring.length();
                if(alternate(substring)==true){
                    res = len > res ? len : res;
                }
            }
        }
        System.out.println(res);
    }
}