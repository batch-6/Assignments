import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    static int func(int D,int fre[]) 
    {
        int p = 0;
        for (int i = 0; i < 201; i++) 
        {
            p += fre[i];
            if (p * 2 > D) 
            {
                return 2 * i;
            } 
            else if (p * 2 == D) 
            {
                for (int j = i + 1; j<201; j++) 
                {
                    if (fre[j]>0) 
                    {
                        return i + j;
                    }
                }
            }
        }
        return -1;
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
    // Write your code here
        int ans = 0;

        int fre[] = new int[205];
        for(int i=0;i<205;i++)
        {
            fre[i] = 0;
        }

        int n = expenditure.size();

        for (int i = 0; i < n; i++) 
        {
            if (i >= d) 
            { 
                if (expenditure.get(i) >= func(d,fre)) 
                {
                    ans++;
                }
                fre[expenditure.get(i - d)]--;
            }
            fre[expenditure.get(i)]++;
        }

        return ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
