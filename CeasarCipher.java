import java.util.*;
class CeasarCipher{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        int[] flag = new int[n];
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i))){
                flag[i]=1;
            }else{
                flag[i]=0;
            }
        }
        s=s.toLowerCase();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Character[] ch= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Collections.rotate(Arrays.asList(ch), -k);
        String res="";
        for(int i=0;i<s.length();i++){
            if(Character.isAlphabetic(s.charAt(i))){
                int index = alpha.indexOf(s.charAt(i));
                if(flag[i]==1){
                    res+=Character.toString(Character.toUpperCase(ch[index]));
                }else{
                    res+=Character.toString(ch[index]);
                }
            }else{
                res+=Character.toString(s.charAt(i));
            }
        }
        System.out.println(res);
    }
}