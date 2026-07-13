class Solution {
    public boolean isIsomorphic(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < arr1.length; i++) {

            if (map1[arr1[i]] != map2[arr2[i]]) {
                return false;
            }

            map1[arr1[i]] = i + 1;
            map2[arr2[i]] = i + 1;
        }

        return true;
    }
}