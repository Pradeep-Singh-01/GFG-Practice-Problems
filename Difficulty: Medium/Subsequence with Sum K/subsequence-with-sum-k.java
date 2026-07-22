class Solution {
     boolean suming(int[] arr, int k, int i,Boolean[][] dp){
        if(i==0){
            return (k == 0 || arr[0] == k);
        }
        if(k==0){
             return true;
        }
          if(dp[k][i]!=null){
              return dp[k][i];
          }
        boolean pick = false;
        if(k>=arr[i]){
            pick = suming(arr,k-arr[i],i-1,dp);
        }
        
        boolean nopick  = suming(arr,k,i-1,dp);
         return dp[k][i] = pick || nopick;
         
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        Boolean dp[][] = new Boolean[k+1][arr.length+1];
        // for(int i=0;i<k;i++){
        //     Arrays.fill(dp[i],false);
        
         return suming(arr,k,arr.length-1,dp);
        
    }
}