class Solution {
    public char repeatedCharacter(String s) {


        
        char[] arr = s.toCharArray();

    int minIndex = Integer.MAX_VALUE;

    for (int i = 0; i < arr.length; i++) {

        int nextIndex = findNextSameChar(arr, i);

        if (nextIndex < minIndex) {
            minIndex = nextIndex;
        }
    }

    if (minIndex == Integer.MAX_VALUE) {
        return '\0';   // koi repeated character nahi mila
    }

    return arr[minIndex];

    }

    public static int findNextSameChar(char[] arr, int index) {
    for (int i = index + 1; i < arr.length; i++) {
        if (arr[i] == arr[index]) {
            return i;
        }
    }
    return Integer.MAX_VALUE;
}
}