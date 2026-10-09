class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int original = num;
        int sumOfDivisors = 0;
        int limit = (int)(Math.sqrt(num));
        for (int i = 1; i <= limit; i++) {
            if (i == 1) {
                sumOfDivisors += i;
                continue;
            }
            if (num % i == 0) {
                sumOfDivisors += i;
                if (i != num/i) {
                    sumOfDivisors += num/i;
                }
            }
        }
        return original == sumOfDivisors;
    }
}