import java.util.*;
public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        boolean upper = false, lower = false, numbers = false, special = false;
        for(int i = 0 ;i<n;i++)
        {
            if(Character.isAlphabetic(s.charAt(i))){
                if(Character.isUpperCase(s.charAt((i)))){
                    upper = true;
                }
                else if(Character.isLowerCase(s.charAt((i)))){
                    lower = true;
                }
            }
            else if(Character.isDigit(s.charAt(i))){
                numbers = true;
            }
            else{
                special = true;
            }
        }
        int count=0;
        if(upper == false){
            count++;
        }
        if(lower == false){
            count++;
        }
        if(numbers == false){
            count++;
        }
        if(special == false){
            count++;
        }
        System.out.println(Math.max(6-n, count));
    
    }
}