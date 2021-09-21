import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // your code here
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        String s = in.next();

        int len = s.length();
        String pattern1 = "ABC";
        String pattern2 = "BABC";
        String pattern3 = "CCAABB";

        int score1 = 0,score2 = 0,score3 = 0,j = 0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)==pattern1.charAt(j))
            {
                score1++;
            }
            j++;
            j%=3;
        }
        
        j = 0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)==pattern2.charAt(j))
            {
                score2++;
            }
            j++;
            j%=4;
        }

        j=0;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)==pattern3.charAt(j))
            {
                score3++;
            }
            j++;
            j%=6;
        }

        int maximumScore = Math.max(score1,Math.max(score2, score3));
        
        System.out.println(maximumScore);
        if(maximumScore == score1)
        {
            System.out.println("Adrian");
        }

        if(maximumScore == score2)
        {
            System.out.println("Bruno");
        }

        if(maximumScore == score3)
        {
            System.out.println("Goran");
        }
    }
}