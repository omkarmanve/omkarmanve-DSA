class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // remainder 0 pehle se index -1 par maana jayega
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int rem = prefixSum % k;

            if (map.containsKey(rem)) {

                // Length at least 2 honi chahiye
              
                   if (i - map.get(rem) >= 2) {
        return true;
    }
               

            } else {
                // Sirf first occurrence store karo
                map.put(rem, i);
            }
        }

        return false;
    }
}