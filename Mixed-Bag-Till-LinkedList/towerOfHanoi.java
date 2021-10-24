import java.io.*;
import java.util.*;
public class Main {
    static int counter = 0;
    public static void towerOfHanoi(int n,String A,String B,String C)
    {
        
        if(n==0)
        {
            return;
        }
        counter++;
        towerOfHanoi(n-1, A, C, B); // shifting first n-1 disks
        System.out.println(A+"->"+C); // shift the last disk from A->C
        towerOfHanoi(n-1, B, A, C); // shifting n-1 disks to target 
        return;
    }
    towerOfHanoi(3,"A","B","C");
    tower(2,A,C,B);
    tower(1,A,C,B);
    A->B

    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        towerOfHanoi(n,"A","B","C");
        // first parameter -> starting tower
        // second parameter -> helper tower
        // third parameter -> target
    }
}