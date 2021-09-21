import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[11];

        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
            freq[arr[i]]++;
        }

        int currentPeople = 0,ans = 0;
        for(int i=0;i<n;i++)
        {
            currentPeople+=freq[i];
            if(currentPeople>=(n/2))
            {
                ans = i;
                break;
            }
        }
        
        System.out.println(ans);
    }
}