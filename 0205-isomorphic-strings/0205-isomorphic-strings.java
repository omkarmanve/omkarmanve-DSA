import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {

            // s -> t mapping
            if (map1.containsKey(arr1[i])) {

                if (map1.get(arr1[i]) != arr2[i]) {
                    return false;
                }

            } else {
                map1.put(arr1[i], arr2[i]);
            }

            // t -> s mapping
            if (map2.containsKey(arr2[i])) {

                if (map2.get(arr2[i]) != arr1[i]) {
                    return false;
                }

            } else {
                map2.put(arr2[i], arr1[i]);
            }
        }

        return true;
    }
}