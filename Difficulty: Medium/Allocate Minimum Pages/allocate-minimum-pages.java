class Solution {
     private boolean isAllocationPossible(int[] arr, long mid, int k){
        int currs =1;
        long pages = 0;
        for(int i=0;i<arr.length;i++){
            pages+=arr[i];
            if(pages>mid){
                currs+=1;
                pages = arr[i];
            }
             if(currs>k){
                 return false;
             }
        }
        return true;
    
     }
    public int findPages(int[] arr, int k) {
        // code here
        if(arr.length<k){
            return -1;
        }
        long res =-1;
        int n = arr.length;
        long s = Integer.MIN_VALUE;
        long e = 0;
        
        for(int i=0;i<n;i++){
            s = Math.max(s,arr[i]);
            e +=arr[i];
        }
        
        while(s<=e){
            long mid = s + (e-s)/2;
            
            if(isAllocationPossible(arr, mid, k)){
                 e = mid-1;
                 res = mid;
            }
            else{
                s = mid+1;
            }
             
        }
         return (int)res;
        
        
    }
}