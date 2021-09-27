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

        Arrays.sort(arr);
        int totalNumberofPunches = 0,x = 0; // x --> Number of bags puched
        for(int i=(n-1);i>=0;i--)
        {
            totalNumberofPunches+=(x*(arr[i])+1); // incrementing totalNumberofPunches
            x++; // incrementing number of bags puched
        }
        System.out.println(totalNumberofPunches);
    }
}