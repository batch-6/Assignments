
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][n];
        int sum1 = 0,sum2 = 0;
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
                if(i%2==0)
                {
                    if(j%2==0)
                    {
                        sum1+=arr[i][j];
                    }
                    else
                    {
                        sum2+=arr[i][j];
                    }
                }
                else
                {
                    if(j%2==1)
                    {
                        sum1+=arr[i][j];
                    }
                    else
                    {
                        sum2+=arr[i][j];
                    }
                }
            }
        }

        System.out.println(sum1);
        System.out.println(sum2);
    }
}