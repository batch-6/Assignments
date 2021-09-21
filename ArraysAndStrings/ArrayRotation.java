import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int rotatedArray[] = new int[n];
        for(int i=0;i<n;i++)
        {
            rotatedArray[(i+k)%n] = arr[i];
        }

        for(int i=0;i<q;i++)
        {
            int index = in.nextInt();
            System.out.println(rotatedArray[index]);
        }
    }
}