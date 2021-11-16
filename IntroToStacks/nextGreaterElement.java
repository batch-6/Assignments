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
        int nge[] = new int[arr.length];
 
        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (!s.empty())
            {
                while (!s.empty()
                       && s.peek() <= arr[i])
                {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(nge[i]+" ");
        }
    }
}