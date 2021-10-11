import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); 
        
        int pre = 0,finalTime = 0;
        for(int i=0;i<n;i++)
        {
            int timeInput = in.nextInt();
            if(i%2!=0)
            {
                finalTime+=(timeInput-pre);
            }
            pre = timeInput;
        }

        if(n%2==0)
        {
            System.out.println(finalTime);
        }
        else
        {
            System.out.println("still running");
        }
    }
}