class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] note = new int[26];

        for(char m:magazine.toCharArray()){
            note[m-'a']++;
        }
        for(char r:ransomNote.toCharArray()){
            if(note[r-'a']==0) return false;
            note[r-'a']--;
        }
        return true;
    }
}
