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

        int key = arr[n-1];
        int j = n-2;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1] = arr[j];
            for(int k=0;k<n;k++)
            {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            j--;
        }
        arr[j+1] = key;
        for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+" ");
        }
       
    }
}