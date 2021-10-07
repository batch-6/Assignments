import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int ans = 0;
        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                ans++;
                j--;
            }
            arr[j + 1] = key;
            // Print the array
        }

        System.out.println(ans);
    }
}