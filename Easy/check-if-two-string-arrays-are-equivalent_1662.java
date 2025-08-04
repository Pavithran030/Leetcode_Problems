class Solution {
    String merge(String[] s){
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length;i++){
            s1.append(s[i]);
        }
        return s1.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String s1=merge(word1);
        String s2=merge(word2);
        return s1.equals(s2);       
    }
}
