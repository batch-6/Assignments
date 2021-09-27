import java.io.*;
import java.util.*;

public class Solution {
    static int N = (100005);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int ans = 0,freq1 = -1,freq2 = -1;
        int cur = 1;
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                cur++;
            }
            else
            {
                if(freq1==-1 && freq2==-1)
                {
                    freq1 = cur;
                }
                else if(freq2==-1)
                {
                    freq2 = cur;
                }
                else
                {
                    freq1 = freq2;
                    freq2 = cur;
                }
                if(freq1 != -1 && freq2!=-1)
                {
                    ans = Math.max(ans, Math.min(freq1,freq2)*2 );
                }
                cur = 1;
            }
        }
        if(freq1==-1 && freq2==-1)
        {
            freq1 = cur;
        }
        else if(freq2==-1)
        {
            freq2 = cur;
        }
        else
        {
            freq1 = freq2;
            freq2 = cur;
        }
        if(freq1 != -1 && freq2!=-1)
        {
            ans = Math.max(ans, Math.min(freq1,freq2)*2 );
        }
        System.out.println(ans);
    }
}