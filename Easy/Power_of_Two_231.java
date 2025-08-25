class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        
        int one=Integer.bitCount(n);

        if(one==1) return true;
        
        return false;
    }
}
