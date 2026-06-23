class Solution {

    public int max(int[] arr, int start, int max) {

        for (int i = arr.length - 1; i >= start; i--) {

            if (arr[max] != arr[i]) {
                max = i;
                break;      
            }
        }

        return max;
    }

    public int maxDistance(int[] colors) {

        int ans = 0;

        for (int i = 0; i < colors.length; i++) {

            int max1 = max(colors, i, i);

            ans = Math.max(ans, max1 - i);
        }

        return ans;
    }
}