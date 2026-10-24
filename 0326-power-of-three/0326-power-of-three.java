class Solution {
    public boolean isPowerOfThree(int n) {
        // Largest 32-bit signed integer power of 3 is 3^19 = 1162261467
        return n > 0 && 1162261467 % n == 0;
    }
}