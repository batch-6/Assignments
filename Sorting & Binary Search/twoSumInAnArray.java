import java.io.*;
import java.util.*;
public class Main {

    static Comparator<List<Integer>> myCompare = new Comparator<List<Integer>>() {
        @Override
        public int compare(List<Integer> o1, List<Integer> o2) {
            if(o1.get(0) > o2.get(0)) // 4 , 3
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

    public static void main(String args[]) {
        // your code here
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            int x = sc.nextInt();
            arr.add(x);
        }

        ArrayList<List<Integer>> a = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> cur = new ArrayList<Integer>();
            cur.add(arr.get(i));
            cur.add(i);
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
        for(int k=0;k<ans.size();k++)
        {
            System.out.print(ans.get(k)+" ");
        }
    }
}