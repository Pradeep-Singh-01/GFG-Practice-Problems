class Solution {
    public int assignHole(int[] mices, int[] holes) {
        // code here
        Arrays.sort(mices);
        Arrays.sort(holes);
        int maxtime =0;
         for(int i=0;i<mices.length;i++){
             maxtime = Math.max(maxtime,Math.abs(mices[i]-holes[i]));
         }
         return maxtime;
         
    }
}