class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
       helper(s, 0, len - 1);
    }
    
    public void helper(char[] s, int start, int end) {
        // base case
        if(start > end) {
            return;
        }
        
        char ch = s[end];
        s[end] = s[start];
        s[start] = ch;
        
        helper(s, start + 1, end - 1);
    }
}