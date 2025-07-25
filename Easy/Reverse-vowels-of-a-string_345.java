class Solution {
    public boolean vowels(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U' ) return true;
        return false;
    }
    public String reverseVowels(String s) {      
        int ri=s.length()-1;
        int le=0;
        char[] vow=s.toCharArray();
        while(le<ri){
            if(!vowels(vow[le])) le++;
            else if (!vowels(vow[ri])) ri--;
            else{
                char tem=vow[le];
                vow[le]=vow[ri];
                vow[ri]=tem;
                le++;
                ri--;
            }
        }
        return new String(vow);
    }
}
