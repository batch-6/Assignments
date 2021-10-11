import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0,last = -1,maximum = 0;
        for(int i=0;i<n;i++)
        {
            int x = in.nextInt();
            if(x>last) // current > previous
            {
                last = x; 
                sum+=x;
            }
            else 
            {
                last = x;
                sum = 0;
            }
            maximum = Math.max(maximum, sum);
        }
        System.out.println(maximum);
    }
}