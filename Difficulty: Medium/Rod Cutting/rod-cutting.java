class Solution {
    public int cut(int[] price, int w,int i,Integer dp[][]){
        if(w==0){
            return 0;
        }
         if(i==0){
             
                 return w * price[i];
             
            //   return 0;
         }
          if(dp[i][w]!=null){
              return dp[i][w];
          }
         int pick =0;
         if(w>=i+1){
             pick = price[i] + cut(price,w-i-1,i,dp);
         }
         int notpick = cut(price,w,i-1,dp);
          return dp[i][w] = Math.max(pick,notpick);
    }
    public int cutRod(int[] price) {
        // code here
        Integer dp[][] = new Integer[price.length][price.length+1];
         return cut(price,price.length,price.length-1,dp);
        
    }
}