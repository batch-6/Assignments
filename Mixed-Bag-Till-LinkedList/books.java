import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long k = in.nextLong();

        long a[] = new long[n];
        for(int i=0;i<n;i++)
        {
            a[i] = in.nextLong();
        }

        int st = 0;
        long len=0,sum=0,ans=0;
        for(int i=0;i<n;i++)
        {
            // adding element
            sum+=a[i];
            len++;
            if(sum<=k)
            {
                ans=Math.max(ans,len);
            }
            else
            {
                // decreasing the size of window
                while(sum>k)
                {
                    sum-=a[st];
                    len--;
                    st++;
                }
            }
        }

        System.out.println(ans);
    }
}