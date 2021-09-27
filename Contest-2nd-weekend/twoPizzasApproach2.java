import java.io.*;
import java.util.*;

public class Solution {
    static int N = (100005);
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        int ans = 0;
        int cur = 1;

        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=1;i<n;i++)
        {
            if(arr[i]==arr[i-1])
            {
                cur++;
            }
            else
            {
                a.add(cur);
                cur = 1;
            }
        }
        a.add(cur);
        for(int i=1;i<a.size();i++)
        {
            ans = Math.max(ans, Math.min(a.get(i-1),a.get(i)) * 2);
        }
        System.out.println(ans);
    }
}