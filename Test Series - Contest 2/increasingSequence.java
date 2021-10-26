import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int ans = 1,currentSum = 1;
        for(int i=1;i<n;i++)
        {
            if(arr[i-1] < arr[i])
            {
                currentSum++;
            }
            else
            {
                currentSum = 1;
            }
            ans = Math.max(ans, currentSum);
        }

        System.out.println(ans);
    }
}