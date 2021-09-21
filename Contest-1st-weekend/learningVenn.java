import java.io.*;
import java.util.*;


public class Solution {
    static int N = (int)(1e7+5);
    static int[] freq1 = new int[N];
    static int[] freq2 = new int[N];
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // TestCase #1 is incomplete for this question
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] arr = new int[n];
        int[] brr = new int[m];

        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
            freq1[arr[i]]++;
        }
        for(int i=0;i<m;i++)
        {
            brr[i] = in.nextInt();
            freq2[brr[i]]++;
        }

        boolean ans = true;
        for(int i=0;i<m;i++)
        {
            if(freq1[brr[i]] < freq2[brr[i]])
            {
                ans = false;
                break;
            }
        }

        if(ans)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}