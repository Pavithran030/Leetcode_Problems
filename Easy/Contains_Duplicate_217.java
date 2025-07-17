class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> se=new HashSet<>();
        for(int n:nums){
            if (se.contains(n)) return true;
            else se.add(n);
        }
        return false;
    }
}
