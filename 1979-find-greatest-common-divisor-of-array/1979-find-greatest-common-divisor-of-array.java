class Solution {
    public int findGCD(int[] nums) {

        int max=nums[0];
        int min=nums[0];
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
           max= Math.max(max,nums[i]);
           min=Math.min(min,nums[i]);
        }

        result=findGCD(min,max);

        return result;
        
    }


      public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}