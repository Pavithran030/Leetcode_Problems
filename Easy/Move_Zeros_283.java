class Solution {
    public void moveZeroes(int[] nums) {
        int si=nums.length;
        int ri=0;

        for(int i=0;i<si;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[ri];
                nums[ri]=temp;
                ri++;
            }
        }       
    }
}
