class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res =  new ArrayList<>();
         Queue<Integer> q = new LinkedList<>();
          boolean vis[] = new boolean[adj.size()];
          q.add(0);
          vis[0] = true;
         while(!q.isEmpty()){
             int node =  q.poll();
            //   if(!vis[node]){
              res.add(node);
               vis[node] = true;
               for( int neighbour: adj.get(node)){
                   if(!vis[neighbour]){
                       vis[neighbour] = true;
                   q.add(neighbour);
                   }
               
              }
             
         }
          return res;
        
        
    }
}