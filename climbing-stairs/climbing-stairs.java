class Solution {
    public int climbStairs(int n) {
        
     int[] memo = new int[n + 1];
        return helper(0, n, memo);
    }

    public int helper(int start, int top, int[] memo) {
        if(start > top)
            return 0;

        if(start == top)
            return 1;

        if(memo[start] > 0)
            return memo[start];

        memo[start] = helper(start+1, top, memo) + helper(start + 2, top, memo);

        return memo[start];
    }
}