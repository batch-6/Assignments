import java.io.*;
import java.util.*;
public class Main {
    static int N = 31;
    static char cur[] = new char[N];

    public static void recur(int i,int n,int sum)
    {
        // base condition 
        if(i==2*n)
        {
            if(sum==0) // balanced 
            {
                for(int j=0;j<2*n;j++)
                {
                    System.out.print(cur[j]);
                }
                System.out.println();
            }
            return;
        }
        
        // cases 
        // opening bracket
        if(sum<n)
        {
            cur[i] = '(';
            recur(i+1,n,(sum+1));
        }
        // closing
        if(sum>=1)
        {
            cur[i] = ')';
            recur(i+1,n,(sum-1));
        }
        return;
    }
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        recur(0,n,0);
    }
}