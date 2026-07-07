class Solution {
    public long sumAndMultiply(int n) {

        if (n == 0) return 0;

        long x = 0;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                sum += digit;
                x = x * 10 + digit;   // 4321
            }

            n /= 10;
        }

        long rev = 0;

        while (x > 0) {
            rev = rev * 10 + x % 10;  // 1234
            x /= 10;
        }

        return rev * sum;
    }
}