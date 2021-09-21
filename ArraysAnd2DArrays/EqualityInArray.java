import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        
        int ma = 0;        
        for(int i=0;i<n;i++)
        {
            ma = Math.max(ma,arr[i]);
        }
        int[] fre = new int[(ma+1)];

        for(int i=0;i<n;i++)
        {
            fre[arr[i]]++;
        }

        int ans = 0;
        for(int i=0;i<(ma+1);i++)
        {
            ans = Math.max(ans,(fre[i]));
        }

        ans = n - ans;
        System.out.println(ans);
    }
}