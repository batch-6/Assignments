import java.util.*;
import java.io.*;

public class Main {

    public static int palin(int x)
    {

        int rev = 0; // storing the reverse number
        while (x > 0)
        {
            int d = x % 10; // find the last digit 
            rev = rev * 10 + d; // multiply by 10 
            x /= 10; 
        }
        return rev;
    }
    
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int reverse = palin(n);
        if (reverse == n)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}