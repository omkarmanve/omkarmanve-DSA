class Solution {
    public int longestConsecutive(int[] nums) {



       HashSet<Integer>hs =new HashSet<>();

       for(int i: nums){
         hs.add(i);

       }

        // [100,4,200,1,3,2]
       int log=0;

      for(int num:hs){

        if(!hs.contains(num-1)){

            int start=num;
            int count=1;

            while(hs.contains(start+1)){
                count++;
                start++;
            }

            log = Math.max(log, count);

        }

      }


    return log;

      
    }
}