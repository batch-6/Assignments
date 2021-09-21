
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int h2 = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();

        int numerator = (h1-h2);
        int denominator = (v2-v1);

        if(denominator != 0)
        {
            if(numerator % denominator == 0)
            {
                System.out.println(true);
            }
            else
            {
                System.out.println(false);
            }
        }
        else
        {
            System.out.println(false);
        }
    }
}