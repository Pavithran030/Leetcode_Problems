class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder re=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                re.append(ch);
            }
        }
        String fin=re.toString();
        fin=fin.toLowerCase();
        int start=0;
        int end =fin.length()-1;
        while(start<end){
            if(fin.charAt(start)!=fin.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}
