class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int si=letters.length;
        for(int i=0;i<si;i++){
            if(target<letters[i]) return letters[i];
        }
        return letters[0];
    }
}
