// Question link - https://leetcode.com/problems/is-graph-bipartite/ 
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int vis[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            vis[i] = -1;
        }

        for (int i = 0; i < n; i++)
        {
            if (vis[i] == -1)
            {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = 1;

                while(!q.isEmpty())
                {
                    int top = q.remove();

                    for(int j=0;j<graph[top].length;j++)
                    {
                        int anotherNode = graph[top][j];
                        if(vis[anotherNode] == -1)
                        {
                            vis[anotherNode] = 1-vis[top];
                            q.add(anotherNode);
                        }
                        else if(vis[anotherNode] == vis[top])
                        {
                            // not bipartite
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
