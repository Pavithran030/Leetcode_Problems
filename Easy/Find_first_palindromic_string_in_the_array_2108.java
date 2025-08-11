class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            StringBuilder re=new StringBuilder(words[i]);
            String fin=re.reverse().toString();
            if(fin.equals(words[i])){
                return words[i];
            }
        }
        return "";
    }
}
