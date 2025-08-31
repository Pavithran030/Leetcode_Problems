class Solution {
    public char findTheDifference(String s, String t) {
        int dup=0;

        for(char c1: t.toCharArray()){
            dup+=(int)c1;
        }
        for(char c2:s.toCharArray()){
            dup-=(int)c2;
        }
        return (char) dup;
    }
}
