import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);

        int ans = 0,currentSum = 0;
        int i = 0, j = 0;
        while(i<n)
        {
            currentSum+=arr[i];
            if(currentSum>k)
            {
                break;
            }
            ans++;

            // skipping all the duplicates 
            while(j<n && arr[j]==arr[i])
            {
                j++;
            }

            i = j;
        }

        System.out.println(ans);
    }
}