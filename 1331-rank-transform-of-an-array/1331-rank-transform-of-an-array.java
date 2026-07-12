class Solution {
    public int[] arrayRankTransform(int[] arr) {

      int n = arr.length;

        // Original array ki copy
        int[] nums = arr.clone();

        // Copy ko sort karo
        Arrays.sort(nums);

        // Value -> Rank store karega
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 1;

        // Sirf unique elements ko rank do
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], count);
                count++;
            }
        }
        

        for(int i=0;i<n;i++){

            arr[i]=map.get(arr[i]);
        }

        return arr;
    }


}