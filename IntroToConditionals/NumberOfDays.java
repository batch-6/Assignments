import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        if(month<=7) 
        {
            if(month%2==0) // even 
            {
                if(month==2) // feb
                {
                    System.out.println("28");
                }
                else // other even months
                {
                    System.out.println("30");
                }
            }
            else // odd months 
            {
                System.out.println("31");
            }
        }
        else 
        {
            if(month%2==0) // even months 
            {
                System.out.println("31");
            }
            else // odd months 
            {
                System.out.println("30");
            }
        }
    }
}