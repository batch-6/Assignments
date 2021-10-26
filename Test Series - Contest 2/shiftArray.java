import java.io.*;
import java.util.*;

public class Solution {

    public static void reverse(int arr[],int st,int en)
    {
        while(st<=en)
        {
            int tmp = arr[st];
            arr[st] = arr[en];
            arr[en] = tmp;
            st++;
            en--;
        }
        return;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        reverse(arr, 0,d-1);
        reverse(arr, d,n-1);
        reverse(arr, 0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}