
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) {
        //your code here

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int ans = 0;

        // N = 7 (111)
        // ans = 3
        
        while(n>0)
        {

            ans+=(n&1);
            // if((n&1)==1)
            // {
            //     ans++;
            // }
            n/=2; // N = 0 (0)
        }
        System.out.print(ans);
    }
}