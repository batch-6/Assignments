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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    static Comparator<List<Integer>> myCompare = new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            if(o1.get(0) > o2.get(0))
            {
                return 1;
            }
            else if(o1.get(0) < o2.get(0))
            {
                return -1;
            }
            return 0;
        }
    };

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here
        int n = arr.size();
        ArrayList<List<Integer>> a = new ArrayList<List<Integer>>(); 
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(arr.get(i));
            cur.add((i+1));
            a.add(cur);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Collections.sort(a,myCompare);
        int i = 0, j = n-1;
        while(i<j)
        {
            int currentSum = a.get(i).get(0)+a.get(j).get(0);
            if(currentSum == m)
            {
                ans.add(a.get(i).get(1));
                ans.add(a.get(j).get(1));
                break;
            }
            else if(currentSum > m)
            {
                j--;
            }
            else
            {
                i++;
            }
        }

        Collections.sort(ans);
        return ans;
    }

   
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.icecreamParlor(m, arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
