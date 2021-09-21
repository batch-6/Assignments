
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<n;i++)
        {
            boolean found = false;
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                {
                    found = true;
                    break;
                }
            }

            if(found)
            {
                for(int j=0;j<m;j++)
                {
                    arr[i][j] = 1;
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}