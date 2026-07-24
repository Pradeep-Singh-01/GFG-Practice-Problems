class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        int n = start.length;
        Integer index[] = new Integer[n];
        for(int i=0;i<n;i++){
            index[i] = i;
        }
        
        Arrays.sort(index,(a,b)->finish[a]-finish[b]);
        
        int count =1;
        int last = finish[index[0]];
         for(int i=1;i<n;i++){
             if(start[index[i]]>last){
                 count++;
                 last = finish[index[i]];
             } 
             
         }
          return count;
        
    }
}
