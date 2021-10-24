import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Test Cases are Big so that's why Big size array
        int states[] = new int[100005]; // O(n)
        states[0] = -1;
        states[1] = states[2] = states[4] = 1;
        states[3] = 0;
        for(int i=5;i<=n;i++)
        {
            if(states[i-1]==0) // losing state
            {
                states[i] = 1;
            }
            else if(states[i-2]==0)
            {
                states[i] = 1;
            }
            else if(states[i-4]==0)
            {
                states[i] = 1;
            }
            else
            {
                states[i] = 0;
            }
        }

        if(states[n]==1)
        {
            System.out.print("Alice");
        }
        else
        {
            System.out.print("Bob");
        }
    }
}