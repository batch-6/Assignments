import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[]) {
        //your code here
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int length = str.length();
        int[] freq = new int[26];
        boolean space_found = false;
        for(int i=0;i<length;i++)
        {
            char currentCharacter = str.charAt(i);
            int ascii_value = currentCharacter;
            if(ascii_value==32)
            {
                space_found = true;
            }
            else
            {
                if(ascii_value>=65 && ascii_value<=90) // A-Z 65-65 === 0 
                {
                    ascii_value-=65; // A-Z 65-90 | 0-26
                }
                else // a-z 97-122 | 97
                {
                    ascii_value-=97;
                }
                freq[ascii_value]++;
            }
        }

        boolean characters_found = true;
        for(int i=0;i<26;i++)
        {
            if(freq[i]==0)
            {
                characters_found = false;
                break;
            }
        }
        
        if(space_found && characters_found)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("not pangram");
        }
    }
}