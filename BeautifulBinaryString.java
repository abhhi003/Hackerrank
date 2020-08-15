import java.util.*;

class BeautifulBinaryString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        for(int i=0;i<s.length()-2;i++)
        {
            String temp = s.substring(i,i+3);
            
            if(temp.equals("010"))
            {
                count++;
                i+=2;
            }
        }
        System.out.println(count);
    }
}