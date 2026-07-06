class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer>map= new HashMap<>();

        map.put(0,1);
        int prfix=0;
       int   count=0;

         for(int i=0;i<nums.length;i++)
         {
             prfix += nums[i];
            if(map.containsKey(prfix-k)){

               count += map.get(prfix - k);


            } 
            map.put(prfix ,map.getOrDefault(prfix, 0)+1);


         }

         return count;
    }
}