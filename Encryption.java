import java.util.*;
class Encryption
{
    static String removeSpace(String s)
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                res=res+Character.toString(s.charAt(i));
            }
        }
        return res;
    }
    static int countChars(String s)
    {
        int l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                l++;
            }
        }
        return l;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int charCount=countChars(s);
        int cols=(int)Math.ceil(Math.sqrt(charCount));
        int rows =(int)Math.floor(Math.sqrt(charCount));

        String s1=removeSpace(s);
        if (rows * cols < s1.length()) {
            rows += 1;
        }

        if(s1.length()%cols!=0)
        {
            for(int i=0;i<s1.length()%cols;i++)
            {
                s1+=" ";
            }
        }
        
        char[] c1=s1.toCharArray();
        char ch[][] = new char[rows][cols];

        for (int i = 0; i < rows; i++)
            System.arraycopy(c1, (i * cols), ch[i], 0, cols);

        String cipher="";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(ch[i][j]);
            }
            System.out.println();
            }

        for(int i=0;i<cols;i++ )
        {
            for(int j=0;j<rows;j++)
            {
                if(ch[j][i]!=' ')
                cipher += Character.toString(ch[j][i]);
            }
            
            cipher+=" ";
        }

        System.out.println(cipher);

    }
}