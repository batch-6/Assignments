import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        // Test Cases for this questions are wrong only Test Case 8 will pass
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        for(int i=1;i<n;i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            for(int k=0;k<n;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}