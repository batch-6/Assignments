import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        double sum = 0.0;
        for (int i = 0; i < n; i++)
        {
            int x = in.nextInt();
            sum += x;
        }

        double avg = sum / n;
        int ans = (int)(Math.floor(avg));
        System.out.println(ans);

    }
}