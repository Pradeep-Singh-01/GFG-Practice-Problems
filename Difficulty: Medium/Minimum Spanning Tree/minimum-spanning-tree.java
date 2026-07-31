class Solution {

    public int spanningTree(int V, int[][] edges) {

        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : edges){

            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            adj.get(u).add(new int[]{v,w});
            adj.get(v).add(new int[]{u,w});
        }

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a,b)->a[2]-b[2]);

        boolean[] visited = new boolean[V];

        pq.offer(new int[]{-1,0,0});

        int sum=0;

        while(!pq.isEmpty()){

            int[] curr=pq.poll();

            int parent=curr[0];
            int node=curr[1];
            int weight=curr[2];

            if(visited[node]) continue;

            visited[node]=true;

            if(parent!=-1){
                sum+=weight;
            }

            for(int[] nei:adj.get(node)){

                int next=nei[0];
                int wt=nei[1];

                if(!visited[next]){
                    pq.offer(new int[]{node,next,wt});
                }
            }
        }

        return sum;
    }
}