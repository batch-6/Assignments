import java.math.BigInteger;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        long ans = 0;
        long p = 1;

        Arrays.sort(arr);
        for(int i=(n-1);i>=0;i--)
        {
            ans = ans+(p*arr[i]);
            p = p*2;
        }

        System.out.println(ans);
    }
}