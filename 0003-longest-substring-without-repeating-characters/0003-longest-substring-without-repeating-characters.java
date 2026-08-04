class Solution {
    public int lengthOfLongestSubstring(String s) {

       char[] arr = s.toCharArray();

        int n= arr.length;
        int left=0;
        int max=0;
        
        HashSet<Character> map = new HashSet<>();

        for(int right=0;right<n;right++){

            while(map.contains(arr[right])){

                map.remove(arr[left]);
                left++;
            }

            map.add(arr[right]);

            max=Math.max(max,right-left+1);

        }
        return max;
    }
}