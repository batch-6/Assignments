class Solution {
    public String removeDuplicates(String s, int k) { 
        
        Stack<ArrayList<Integer>> st = new Stack<ArrayList<Integer>>();

        int l = s.length();
        for(int i=0;i<l;i++)
        {
            if(st.empty())
            {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add((int)(s.charAt(i)));
                arr.add(1);
                st.push(arr);
            }
            else
            {
                int cur_ascii = s.charAt(i);
                int cur_freq = 1;
                if(cur_ascii == st.peek().get(0))
                {
                    cur_freq = st.peek().get(1) + 1;
                    st.pop();
                }
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(cur_ascii);
                arr.add(cur_freq);
                st.push(arr);
            }
            if(st.peek().get(1)==k)
            {
                st.pop();
            }
        }

        String ans = "";
        
        while(!st.empty())
        {
            int ascii = st.peek().get(0);
            int freq = st.peek().get(1);

            while(freq>0)
            {
                ans = (ans + (char)(ascii));
                freq--;
            }
            
            st.pop();
        }
        
        l = ans.length();
        String rev = "";

        for(int i=(l-1);i>=0;i--)
        {
            rev += ans.charAt(i);
        }
        return rev;
    }
}