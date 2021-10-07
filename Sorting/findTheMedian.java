import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[(n/2)]);
    }
}