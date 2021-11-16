import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        char[] char_array = s.toCharArray();
        char ans[] = new char[n];
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<n;i++)
        {
            st.push(char_array[i]);
        }
        int i=0;
        while(!st.empty())
        {
            ans[i++] = st.peek();
            st.pop();
        }
        String output = String.copyValueOf(ans);
        System.out.print(output);
    }
}
