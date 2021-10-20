import java.util.*;
import java.io.*;

public class Main {
    static long func(long sum)
    {
        if(sum<10) // base case when number has only one digit
        {
            return sum;
        }

        // Recursive Case
        long new_sum = 0;
        while(sum>0)
        {
            long digit = sum%(10);
            new_sum+=digit;
            sum/=10;
        }

        return func(new_sum);
    }

    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();

        long sum = 0;

        for(int i=0;i<s.length();i++)
        {
            int ascii_value = (s.charAt(i));
            ascii_value-=48;
            sum+=ascii_value;
        }
        sum*=k;

        long ans = func(sum);
        System.out.println(ans);
    }
}