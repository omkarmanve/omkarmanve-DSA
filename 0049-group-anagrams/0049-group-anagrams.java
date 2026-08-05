import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Key = Sorted String
        // Value = List of Anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Traverse every string
        for (String s : strs) {

            // Convert string to char array
            char[] ch = s.toCharArray();

            // Sort characters
            Arrays.sort(ch);

            // Convert sorted char array back to String
            String key = new String(ch);

            // If key is not present, create a new empty list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            // Add the original string to its anagram group
            map.get(key).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }
}
