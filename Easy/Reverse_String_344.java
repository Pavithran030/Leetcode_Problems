class Solution {
    public void reverseString(char[] s) {
        int le=0;
        int ri=s.length-1;
        while(le<ri){
            char ch=s[le];
            s[le]=s[ri];
            s[ri]=ch;
            le++;
            ri--;
        }        
    }
}
