import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        int num = 0;
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
            if(i==(k-1))
            {
                num = arr[i];
            }
        }

        int ans = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=num && arr[i]>0)
            {
                ans++;
            }
        }

        System.out.println(ans);
    }
}