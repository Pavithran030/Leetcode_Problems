class Solution {
    public int missingNumber(int[] nums) {
        //Arrays.sort(nums);
        int fin=nums.length;
        for(int i=0;i<nums.length;i++){
            fin+=i-nums[i];
        }
        return fin;
    }
}
