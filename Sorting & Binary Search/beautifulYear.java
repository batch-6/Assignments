
import java.util.*;
import java.io.*;

public class Main {

    static boolean func(int x)
    {
        int fre[] = new int[10];
        while(x>0)
        {
            int d = x%10;
            fre[d]++;
            x/=10;
        }
        for(int i=0;i<=9;i++)
        {
            if(fre[i]>1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        //your code here
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        n++;
        while(true)
        {
            if(func(n))
            {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}