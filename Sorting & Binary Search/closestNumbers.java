import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++)
        {
            mini = Math.min(mini, arr[i+1]-arr[i]);
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<n-1;i++)
        {
            int cur = arr[i+1]-arr[i];
            if(cur==mini)
            {
                ans.add(arr[i]);
                ans.add(arr[i+1]);
            }
        }

        for(int i=0;i<ans.size();i++)
        {
            System.out.print(ans.get(i)+" ");
        }
    }
}