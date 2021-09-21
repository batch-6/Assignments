import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t > 0)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            int numberOfStudentsInClass = 0;
            for (int i = 0; i < n; i++)
            {
                int x = in.nextInt();
                if (x <= 0)
                {
                    numberOfStudentsInClass++;
                }
            }
            if (numberOfStudentsInClass >= k)
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
            t--;
        }
    }
}