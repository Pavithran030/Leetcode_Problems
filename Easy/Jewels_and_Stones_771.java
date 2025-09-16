class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // int count =0;
        // for(int i=0;i<stones.length();i++){
        //     for(char ch : jewels.toCharArray()){
        //         if(ch == stones.charAt(i)) count ++;
        //     }
        // }
        // return count;

        Set<Character> je=new HashSet<>();
        for(char ch:jewels.toCharArray()){
            je.add(ch);
        }
        int count=0;
        for(char c1:stones.toCharArray()){
            if(je.contains(c1)) count++;
        }
        return count;
    }
}
