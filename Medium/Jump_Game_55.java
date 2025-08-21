class Solution {
    public boolean canJump(int[] nums) {
        int fin=0;

        for(int i=0;i<nums.length;i++){
            if(i>fin) return false;

            fin=Math.max(fin,i+nums[i]);
        }
        return true;
    }
}
