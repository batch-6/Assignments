import java.io.*;
import java.util.*;

import java.util.ArrayList;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>s1 = new Stack<Integer>();
        Stack<Integer>s2 = new Stack<Integer>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                int y = sc.nextInt();

                if (s1.empty()) {
                    s1.push(y);
                    s2.push(y);
                } else {
                    if (s2.peek() > y) {
                        s1.push(y);
                        s2.push(s2.peek());
                    } else
                    {
                        s1.push(y);
                        s2.push(y);
                    }
                }

            } else if (x == 2) {
                s1.pop();
                s2.pop();
            } else {
                System.out.println(s2.peek());
            }
        }
    }
}
