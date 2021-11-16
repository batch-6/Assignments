import java.util.*;
import java.io.*;

public class Main {
    public static boolean isSet(long number, int bit)
    {
        return ((number>>bit)&1) == 1;
    }

    public static long flipBit(long number, int bit)
    {
        return number ^ (1L<<bit);
    }

    public static long swapBits(long n) {
        for(int i = 0 ; i < 32 ; i+=2) {
            if(isSet(n, i) ^ isSet(n, i+1))
            {
                n = flipBit(n, i);
                n = flipBit(n, i+1);
            }
        }
        return n;
    }
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long ans = swapBits(n);
        System.out.print(ans);
    }
}