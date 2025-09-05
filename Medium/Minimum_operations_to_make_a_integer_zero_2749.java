class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int count=1;

        while(count<60){
            long target=num1-(long)count*num2;
            if(target<count) return -1;
            if(count>=Long.bitCount(target)) return count;
            count++;
        }
        return -1;
    }
}
