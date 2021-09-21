import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();

        int ans = (int)(Math.pow(n, p));
        System.out.println(ans);
    }
}