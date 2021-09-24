import java.io.*;
import java.util.*;
public class Main {

    static int func(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int currentAnswer = func(n-1)+func(n-2);
        return currentAnswer;
    }
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int ans = func(n);
        System.out.println(ans);
    }
}