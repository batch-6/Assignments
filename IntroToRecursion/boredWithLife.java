
import java.util.*;
import java.io.*;
public class Main {

    // recursive function
    static int func(int index,int a,int b)
    {
        // Base Case
        if(index == Math.min(a,b))
        {
            return index;
        }

        // Recursive Case
        int currentAnswer = index * (func(index+1,a,b));
        return currentAnswer;
    }

    public static void main(String args[]) {
        //your code here
        // 12! = 4e8
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        // Iterative Approach | Just for understanding
        // int ans = 1;
        // for(int i=1;i<=Math.min(a,b);i++)
        // {
        //     ans = ans*i;
        // }

        int ans = func(1,a,b);

        System.out.println(ans);
    }
}