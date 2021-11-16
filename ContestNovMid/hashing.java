import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tar = in.nextInt();

        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x = in.nextInt();
            if(m.containsKey(tar-x))
            {
                System.out.print("1");
                return;
            }
            m.put(x,1);
        }
        
        System.out.print("0");
    }
}