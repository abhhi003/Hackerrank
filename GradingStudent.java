import java.util.*;
class GradingStudent
{
    public static List<Integer> gradingStudents(List<Integer> grades) 
    {
        List<Integer> answer = new ArrayList<Integer>();
        int n = 0;
        for (int i = 0; i < grades.size(); i++) {
            n = grades.get(i);
            int temp = n;
            int rem = n % 5;
            int a = 5 - rem;
            if (a < 3) {
                n = n + a;
                if (n < 40) {
                    n = temp;
                }
            }
            answer.add(n);
        }
        return answer;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            l.add(sc.nextInt());
        }
        List<Integer> answer = new ArrayList<Integer>();
        answer = gradingStudents(l);
        for (int i = 0; i < n; i++) 
        {
            System.out.println(answer.get(i));
        }
        sc.close();
    }
}