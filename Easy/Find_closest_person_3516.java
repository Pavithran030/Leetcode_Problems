class Solution {
    public int findClosest(int x, int y, int z) {
        int a_diff=Math.abs(x-z);
        int b_diff=Math.abs(y-z);
        if(a_diff<b_diff) return 1;
        else if (a_diff>b_diff) return 2;
        else return 0;
    }
}
