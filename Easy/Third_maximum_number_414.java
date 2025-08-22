class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> fin=new HashSet<>();
        for(int i:nums){
            fin.add(i);
        }
        int[] num=new int[fin.size()];
        int k=0;
        for(int j:fin){
            num[k]=j;
            k++;
        }
        Arrays.sort(num);
        if(num.length <3) return num[num.length-1];
        return num[num.length-3];
    }
}
