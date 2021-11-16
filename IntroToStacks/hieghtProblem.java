import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        Stack<Integer> s = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=0;i<n;i++)
        {
            ans[i] = -1;
        }
 
        for (int i = arr.length-1; i>=0 ; i--)
        {
            while(!s.empty() && arr[i]<arr[s.peek()])
            {
                ans[s.peek()] = arr[i];
                s.pop();
            }
            s.push(i);
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}