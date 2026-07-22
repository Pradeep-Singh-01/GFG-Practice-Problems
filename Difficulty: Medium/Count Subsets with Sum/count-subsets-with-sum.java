class Solution {
    public  static int sumi(int[] arr, int target, int i,Integer dp[][]){
        if(i == 0){
            if(target == 0 && arr[0] == 0)
                return 2;

        if(target == 0 || target == arr[0])
            return 1;

            return 0;
        }
        if(dp[i][target]!=null){
            return dp[i][target];
        }
        int pick = 0;
        if(target>=arr[i]){
             pick = sumi(arr,target-arr[i],i-1,dp);
        }
         
        int nopick = sumi(arr,target,i-1,dp);
        return  dp[i][target] =pick + nopick;
    }
    static int perfectSum(int[] arr, int target) {
        // code here
        Integer dp[][] = new Integer[arr.length+1][target+1];
        return sumi(arr,target,arr.length-1,dp);
    }
}