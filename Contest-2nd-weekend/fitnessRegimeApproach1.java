import java.io.*;
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        // Using Frequency Array
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int maximumEle = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
            maximumEle = Math.max(maximumEle, arr[i]);
        }

        maximumEle+=1;
        int freq[] = new int[maximumEle];
        
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]=1;
        }

        int ans = 0,currentSum = 0;
        for(int i=0;i<maximumEle;i++)
        {
            if(freq[i]==1)
            {
                currentSum+=i; // our current calories
                if(currentSum>k) // K --> Maximum calories given in the question
                {
                    break;
                }
                ans++;
            }
        }
        System.out.println(ans);
    }
}