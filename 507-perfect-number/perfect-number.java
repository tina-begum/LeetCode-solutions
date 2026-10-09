class Solution {
    public boolean checkPerfectNumber(int num) {
        int original = num;
        int sumOfDivisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return original == sumOfDivisors;
    }
}