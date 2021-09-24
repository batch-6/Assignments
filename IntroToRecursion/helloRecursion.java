
import java.util.*;
import java.io.*;
public class Main {

    static int func(int index,int N,int arr[]){

        // Base Case
        if(index==N)
        {
            return 0;
        }

        // Recursive Case 
        int currentAnswer = arr[index]+func(index+1,N,arr);
        return currentAnswer;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int testNumber = 1;
        while(t>0)
        {
            int n = in.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = in.nextInt();
            }

            int ans = func(0,n,arr);
            System.out.println("Case "+testNumber+": "+ans);
            t--;
            testNumber++;
        }
    }
}