import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int a_thres = in.nextInt();
        int b_thres = in.nextInt();
        int n = in.nextInt();

        int ans = a*b;
        int tmp_a = a,tmp_b = b,tmp_n = n;
        while(n>0)
        {
            if(a>a_thres)
            {
                a--;
            }
            else if(b>b_thres)
            {
                b--;
            }
            ans = Math.min(ans, (a*b));
            n--;
        }

        a = tmp_a;
        b = tmp_b;
        n = tmp_n;
        while(n>0)
        {
            if(b>b_thres)
            {
                b--;
            }
            else if(a>a_thres)
            {
                a--;
            }
            ans = Math.min(ans, (a*b));
            n--;
        }

        System.out.println(ans);
    }
}