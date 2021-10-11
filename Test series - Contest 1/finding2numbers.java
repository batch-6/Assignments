import java.io.*;
import java.util.*;

public class Solution {
    static int N = (int)(1e7+5);
    static int fre[] = new int[N];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        long ans = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
            fre[arr[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            int other = k-arr[i];
            if(other>=0 && other<N)
            {
                if(arr[i]==other)
                {
                    ans+=(long)(fre[other]-1);
                }
                else
                {
                    ans+=(long)(fre[other]);
                }
            }
        }
        ans/=2l;
        if(ans==0)
        {
            ans = -1;
        }
        System.out.println(ans);
    }
}