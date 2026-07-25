class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n =val.length;
        Integer arr[] = new Integer[n];
        
        for(int i=0;i<n;i++){
           arr[i] = i; 
        }
         Arrays.sort(arr,(a,b)->Double.compare( (double)val[b]/wt[b],(double)val[a]/wt[a]));
         double ans =0;
         for(int i=0;i<n;i++){
            int ind = arr[i];
            if(capacity>=wt[ind]){
                 ans+=val[ind];
                 capacity-=wt[ind];
            }
            else if(capacity>=0 && capacity<wt[ind]){
                ans += ((double)capacity/wt[ind])*val[ind];
                capacity =0;
                  
                 
                 
            }
         }
         return ans;
        
    }
}