class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int decimalValue=0;
        List <Boolean> re =new ArrayList <>();
        for (int i = 0; i <nums.length; i++) {
            decimalValue = (decimalValue * 2 + nums[i])%5;
            re.add(decimalValue==0);
        }
        return re;
    }
}
