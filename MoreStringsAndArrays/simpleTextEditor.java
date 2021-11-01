import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here

        /*
        TestCase ->
        c
        
        ""
        "abc"
        ""
        8
        1 abc
        3 3
        2 3
        1 xy
        3 2
        4
        4
        3 1

        */
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();

        String cur = "";
        Stack<String> st = new Stack<String>();
        st.push(cur);
        for(int i=0;i<q;i++)
        {
            int val = in.nextInt();
            if(val==1)
            {
                String f = in.next();
                cur+=f;
                st.push(cur);
            }
            else if(val==2)
            {
                int k = in.nextInt();
                cur = cur.substring(0, (cur.length()-k));
                st.push(cur);
            }
            else if(val==3)
            {
                int k = in.nextInt();
                System.out.println(cur.charAt(k-1));
            }
            else
            {
                if(!st.empty())
                {
                    st.pop();
                    cur = st.peek();
                }
            }
        }
    }
}