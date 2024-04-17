class Solution {
    public boolean isPowerOfThree(int n) {
    if (n <= 0) return false;
    
    // Keep dividing n by 3 until it becomes 1
    while (n > 1) {
        // If n is not divisible by 3, it's not a power of three
        if (n % 3 != 0) return false;
        n /= 3;
    }
    
      // At this point, n should be 1 if it's a power of three
      return n == 1;
    }
}