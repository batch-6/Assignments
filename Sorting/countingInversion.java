import java.io.*;
import java.util.*;
public class Main {
    static int merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0;
        int k = l;
        int ans = 0,count = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // smaller element is present in left
                ans+=count; // ans+=count
                arr[k] = L[i];
                i++;
            }
            else { // smaller element is present in right
                count++;
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            ans+=count;
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            count++; // need not do
            arr[k] = R[j];
            j++;
            k++;
        }
        return ans;
    }
    static int func(int arr[],int l,int r)
    {
        if(l>=r)
        {
            return 0;
        }
        int m = l+(r-l)/2;
        int currentAns = 0;
        currentAns += func(arr,l,m); //left part
        currentAns += func(arr,m+1,r); // right part
        currentAns += merge(arr,l,m,r); // from merging
        return currentAns;
    }
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0)
        {
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = in.nextInt();
            }

            int ans = func(arr,0,(n-1));
            System.out.println(ans);
            t--;
        }
    }
}