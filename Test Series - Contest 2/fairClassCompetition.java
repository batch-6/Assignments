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

        int i = 0,j = n-1;
        while(i<j)
        {
            System.out.print(arr[j]+" ");
            j--;
            System.out.print(arr[i]+" ");
            i++;
        }
        if(n%2==1)
        {
            System.out.print(arr[(n/2)]);
        }
    }
}