class Solution {
     public void dfs(int node,int v, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> adj ,boolean[] vis){
        vis[node] = true;
         res.add(node);
           for(int neighbour:adj.get(node)){
               if(!vis[neighbour]){
                   dfs(neighbour, v, res,adj,vis);
               }
               
           }
     }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean vis[] = new boolean[adj.size()];
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0; i<adj.size();i++){
            if(!vis[i]){
                dfs(i,adj.size(), res,adj,vis);
            }
        }
         return res;
    }
}