class Solution {
    public int kthGrammar(int n, int k) {
        
         //base case
         if(n == 1 && k == 1) {
             return 0;
         }

         int len = (int) Math.pow(2, n-1);
         
         int mid = len/2;

         if(k <= mid) {
             return kthGrammar(n-1, k);
         } else {
             int value = kthGrammar(n-1, k-mid);
             return value == 0 ? 1 : 0;
         }

    }


}