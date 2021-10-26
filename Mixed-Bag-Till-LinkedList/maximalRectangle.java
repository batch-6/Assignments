import java.io.*;
import java.util.*;
public class Main {
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<Integer>();
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0;i<n;i++)
        {
            left[i] = -1;
            right[i] = n;
        }
        for(int i=0;i<n;i++)
        {
            if(st.empty())
            {
                st.push(i);
            }
            else
            {
                while(!st.empty() && heights[i]<heights[st.peek()])
                {
                    right[st.peek()] = i; // index of next smaller element
                    st.pop();
                }
                st.push(i);
            }
        }
        while(!st.empty())
        {
            st.pop();
        }
        for(int i=(n-1);i>=0;i--)
        {
            if(st.empty())
            {
                st.push(i);
            }
            else
            {
                while(!st.empty() && heights[i]<heights[st.peek()])
                {
                    left[st.peek()] = i;
                    st.pop();
                }
                st.push(i);
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++)
        {
            int width = right[i]-left[i]-1;
            ans = Math.max(ans, width*heights[i]);
            // System.out.print(width+" ");
        }
        return ans;
    }
    public static void main(String args[]) {
        // your code here

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int arr[][] = new int[n][m];

        // arr[i] --> row

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = in.nextInt();
            }
        }

        for(int j=0;j<m;j++)
        {
            int sum = 0;
            for(int i=0;i<n;i++)
            {
                if(arr[i][j]!=0)
                {
                    sum+=arr[i][j];
                }
                else
                {
                    sum = 0;
                }
                arr[i][j] = sum;
            }
        }

        int ans = 0;
        for(int i=0;i<n;i++)
        {
            ans = Math.max(ans, largestRectangleArea(arr[i]));
        }

        System.out.println(ans);
    }
}