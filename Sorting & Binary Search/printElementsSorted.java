import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        while(i<n)
        {
            int j = i,f = 0;
            while(j<n && arr[i]==arr[j])
            {
                f++;
                j++;
            }
            if(f>1)
            {
                ans.add(arr[i]);
            }
            i = j;
        }

        if(ans.size()==0)
        {
            System.out.println(-1);
        }
        else
        {
            for(i=0;i<ans.size();i++)
            {
                System.out.print(ans.get(i)+" ");
            }
        }
    }
}