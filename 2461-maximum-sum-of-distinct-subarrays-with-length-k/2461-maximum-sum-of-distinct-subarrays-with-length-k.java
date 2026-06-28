import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long ans = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // Current element add
            sum += nums[right];
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // Window size > k ho gayi
            if (right - left + 1 > k) {

                sum -= nums[left];

                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // Window size == k
            if (right - left + 1 == k) {

                // Sab elements unique hain
                if (map.size() == k) {
                    ans = Math.max(ans, sum);
                }
            }
        }

        return ans;
    }
}