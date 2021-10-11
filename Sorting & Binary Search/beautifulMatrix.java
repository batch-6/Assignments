
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        int n = 5;
        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=0)
                {
                    int row_operations = Math.abs((n/2)-i);
                    int col_operations = Math.abs((n/2)-j);
                    int ans = row_operations+col_operations;
                    System.out.println(ans);
                }
            }
        }
    }
}