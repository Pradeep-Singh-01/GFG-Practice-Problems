class Solution {
    int knap(int w, int[] val, int[] wt, int i, Integer dp[][]){
        if(w==0){
            return 0;
            
        } if(i==0){
            if(wt[i]<=w){
                return val[i];
            }
            return 0;
        }
        if(dp[w][i]!=null){
            return dp[w][i];
        }
        
         int pick =0;
          if(w>=wt[i]){
              pick = val[i] +knap(w-wt[i],val,wt,i-1,dp);
          }
           int nopick = knap(w,val,wt,i-1,dp);
           
           return dp[w][i] = Math.max(pick,nopick);
    }
    public int knapsack(int W, int val[], int wt[]) {
        Integer dp[][] = new Integer[W+1][wt.length];
        // code here
        return knap(W,val,wt,wt.length-1,dp);
        
    }
}
