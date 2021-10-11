import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int len = s.length();
        int ans = 1;
        for(int i=0;i<len;i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                ans+=1;
            }
        }

        System.out.println(ans);
    }
}